var ConfigurePath = () => {

  //var excelSheetPath ='C:/Jenkinspath/testdatafiles/testDataSheetPreprod.xls';
  //var excelSheetPath ='C:/Jenkinspath/testdatafiles';
  //var excelSheetPath ='./test/testdatafiles/testDataSheetProd.xls';
  //var excelSheetPath = './test/testdatafiles/testDataSheetPreprod.xls';
  var excelSheetPath = './test/testdatafiles/testDataSheetStagingEnv.xls';
  var downloadLocalPath = 'C:\\Users\\Qualitrix\\Downloads\\';



  //   var AppURL='https://diksha.gov.in';
  //var AppURL = 'https://preprod.ntp.net.in';
  //   var AppURL='https://staging.ntp.net.in';
  var AppURL = 'https://staging.sunbirded.org';

  //var AppURL='https://staging.diksha.gov.in';
  //var AppURL='https://dev.diksha.gov.in/';

  return {
    excelSheetPath,
    AppURL,
    downloadLocalPath,
  };
};
module.exports = {
  ConfigurePath,
}
