package day11_cookies_tables;

public class Knowledge {

    /*

     //Sayfanın sonuna gitmek için
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.END).perform();

  Web tablolarındaki verileri okumak, tablodaki öğeleri bulmak, veri doğrulaması yapmak veya
  tablodaki etkileşimleri gerçekleştirmek için aşağıdaki adımları takip edebilirsiniz:

    1)Tabloyu locate edin:-->//tbody olabilir xpath
  WebElement table = driver.findElement(By.xpath("//table[@id='myTable']"));
  // Örneğin, tabloyu XPath ile locate ediyoruz

    2)Tablodaki verileri okuyun:
  Tablodaki satırları ve sütunları locate ederek verilere erişebilirsiniz.
  Örneğin, tüm satırları ve sütunları okumak için aşağıdaki gibi bir döngü kullanabilirsiniz:
  List<WebElement> rows = table.findElements(By.tagName("tr")); // Tablodaki tüm satırları locate edin
  for (WebElement row : rows) {
    List<WebElement> cells = row.findElements(By.tagName("td")); // Satırdaki tüm hücreleri locate edin
    for (WebElement cell : cells) {
        String cellText = cell.getText(); // Hücrenin metin içeriğini alın
        System.out.println("Hücre İçeriği: " + cellText);
      }
    }
    3)Tablodaki verileri doğrulayın:
  Tablodaki verileri beklenen değerlerle karşılaştırarak doğrulama yapabilirsiniz.

  Örneğin, belirli bir hücredeki değeri doğrulamak için aşağıdaki gibi bir kod kullanabilirsiniz:

  WebElement cell = table.findElement(By.xpath("//tr[2]/td[3]"));
  // Örneğin, 2. satır ve 3. sütundaki hücreyi locate edin
  String expectedValue = "50"; // Beklenen değeri belirtin
  Assert.assertEquals(expectedValue, cell.getText()); // Hücredeki değeri beklenen değerle karşılaştırın

    4)Tabloda etkileşimler gerçekleştirin:
  Tablodaki öğelerle etkileşimde bulunmak istediğiniz durumlarda, öğeleri locate edip uygun işlemleri
  gerçekleştirebilirsiniz. Örneğin, bir düğmeye tıklamak veya
  bir bağlantıya gitmek için aşağıdaki gibi bir kod kullanabilirsiniz:

  WebElement button = table.findElement(By.xpath("//tr[

            ==============<tr> ve <td>=================

    Tablolardaki verileri düzenlemek için <tr> ve <td> etiketlerini kullanırız.

    Her <tr> (Table Row) etiketi, tabloda bir satırı temsil eder.
    Bir tablodaki her satırı <tr> etiketiyle başlatıp </tr> etiketiyle sonlandırırız.

    <tr>...</tr>
    <tr>...</tr>
    <tr>...</tr>
    <tr>...</tr> bunlar satır satır gösterir

    Her bir   <tr>
        <td>Satır 1, Sütun 1</td>
        <td>Satır 1, Sütun 2</td>
        <td>Satır 1, Sütun 3</td>
        <td>Satır 1, Sütun 4</td>
        <td>Satır 1, Sütun 5</td>=====>bu beş data bize 1.<tr> (satırın) içinde 5 sütunun olduğunu gösterir.
    </tr>

     Her <td> (Table Data) etiketi ise tabloda bir hücreyi temsil eder.
     <td> etiketiyle başlatılan bir hücre, </td> etiketiyle sonlandırılır.

     */
}
