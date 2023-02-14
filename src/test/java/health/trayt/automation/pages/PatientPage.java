package health.trayt.automation.pages;

import health.trayt.automation.annotations.Page;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@Page
@Getter
@Setter
@Slf4j
public class PatientPage extends Base {

    @FindBy(xpath = "(//span[text()='Start Session'])[1]")
    private WebElement startSession;

    @FindBy(xpath = "//*[contains(text(),'Your patients')]")
    private WebElement patientsTabValidator;

    @FindBy(css= ".MuiInput-input.MuiInputBase-input")
    private WebElement patientSearch;


    @FindBy(xpath= "//*[contains(@class,'MuiTableRow-root table-row cursor-pointer')]")
    private WebElement selectPatient;

    @FindBy(xpath= "//*[contains(@class,'MuiTableRow-root table-row cursor-pointer')]//td[2]")
    private WebElement fileUploaded;

    @FindBy(xpath= "//*[contains(@class,'MuiTableRow-root table-row cursor-pointer')]//td[1]/span")
    private WebElement searchResultCheckBox;

    public boolean isLoaded() {
        return patientsTabValidator.getText().trim().contains("Your patients");
    }
}
