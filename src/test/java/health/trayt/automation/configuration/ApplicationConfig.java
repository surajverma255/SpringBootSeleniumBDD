package health.trayt.automation.configuration;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Optional;

@Component
@Getter
public class ApplicationConfig {

  @Value("${clinician-portal.url}")
  private String clinicianPortalURL;

  @Value("${school-portal.url}")
  private String schoolPortalURL;

  @Value("#{${clinician-portal.credentials}}")
  private Map<String, String> clinicianPortalCredentials;

  @Value("#{${school-portal.credentials}}")
  private Map<String, String> schoolPortalCredentials;

  public Credentials getUserCredentials(String portalType, String userType) {
    // ToDO add code to decrypt credentials
    if (portalType.equalsIgnoreCase("school"))
      return getClinicianPortalCredentials(schoolPortalCredentials, userType);

    return getClinicianPortalCredentials(clinicianPortalCredentials, userType);
  }

  private Credentials getClinicianPortalCredentials(
      Map<String, String> credentials, String userType) {
    Optional<Credentials> loginCredentials =
        credentials.entrySet().stream()
            .filter(type -> userType.equalsIgnoreCase(type.getKey()))
            .map(
                entry ->
                    Credentials.builder()
                        .userName(entry.getValue().split("=")[0])
                        .password(entry.getValue().split("=")[1])
                        .build())
            .findFirst();
    return loginCredentials.orElse(null);
  }
}
