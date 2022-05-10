package resources.testdata;

import org.testng.annotations.DataProvider;

public class TestData {
    @DataProvider(name = "JobSearch")
    public Object[][] getData() {
        Object[][] data = new Object[][]{
                {"Tester", "Harrow ", "5", "30000", "500000 ", "annum", "Permanent", "Tester jobs in Harrow on the Hill"},
               {"Tester", "Harrow on the Hill", "5", "300", "5000", "annum", "Permanent", "Permanent Tester jobs in Harrow on the Hill"},
                {"Plumber", "London", "7", "3000", "40000", "month", "Contract", "Contract Plumber jobs in London"},
                {"Cook", "Cambridge", "5", "1000", "5000", "week", "Part Time", "Part Time Cook jobs in Cambridge"},
                {"Nurse", "Essex", "2", "80", "7000", "day", "Contract", "Contract Nurse jobs in Essex"},
                {"Teacher", "Oxford", "5", "800", "40000", "annum", "Apprenticeship", "Apprenticeship Teacher jobs in Oxford"},
                {"Developer", "Nottingham", "7", "900", "30000", "month", "Permanent", "Permanent Developer jobs in Nottingham"},
                {"Tester", "Colchester", "2", "100", "20000", "hour", "Permanent", "Permanent Tester jobs in Colchester"},
        };
       return data;
    }
}





