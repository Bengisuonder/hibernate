### 1. JDBC Nedir ve Neden Gerekli?

**JDBC (Java Database Connectivity)**, Java uygulamalarının farklı veritabanlarıyla (MySQL, PostgreSQL vb.) iletişim kurmasını sağlayan standart bir API'dir.

JDBC'nin temel görevleri ve avantajları:

- **Veritabanı Bağlantısı Sağlar:** Java uygulamasının veritabanına bağlanmasını mümkün kılar.
- **SQL Sorgularını Çalıştırır:** Java kodu içinde SQL komutlarını yazıp çalıştırmaya olanak sağlar.
- **Sonuçları Yönetir:** Veritabanından dönen verileri alır, işler ve Java nesnelerine dönüştürür.
- **Taşınabilir ve Esnektir:** Aynı API ile farklı veritabanlarında çalışabilir, platformdan bağımsızdır.

JDBC sayesinde Java uygulamalarınızda doğrudan veritabanı işlemlerini yapabilir, veri ekleme, silme, güncelleme ve sorgulama gibi işlemleri gerçekleştirebilirsiniz.

---

### 2. DAO (Data Access Object) Deseni Nedir? Neden Kullanılır?

**DAO Deseni**, uygulamanın veri erişim katmanını soyutlamak ve merkezi hale getirmek için kullanılan tasarım desenidir.

DAO'nun amaçları ve faydaları:

- **Veri erişim kodunu izole eder:** İş mantığından veri erişim kodunu ayırarak katmanlar arası sorumluluğu netleştirir.
- **Değişikliklere esneklik sağlar:** Veri kaynağı değişse bile uygulamanın diğer bölümleri etkilenmez.
- **Kodun okunabilirliği ve bakımı kolaylaşır:** Veri işlemleri tek bir yerde toplandığı için kod yönetimi daha kolaydır.
- **Tekrar kullanılabilir ve modülerdir:** Aynı veri erişim kodu farklı yerlerde kullanılabilir.

Bu sayede veri işlemleri merkezi ve düzenli yönetilir, test edilebilirlik artar, uygulama sürdürülebilir olur.

---

### 3. ORM (Object-Relational Mapping) ve Hibernate’in Önemi

**ORM**, nesne yönelimli programlama ile ilişkisel veritabanları arasındaki veri dönüşümünü otomatikleştirir. Java'da popüler ORM araçlarından biri **Hibernate**'dir.

Hibernate'in sağladığı temel avantajlar:

- **SQL yazmadan nesnelerle veritabanı işlemi:** Kodunuzda SQL sorguları yazmadan Java nesneleri üzerinden CRUD işlemleri yapabilirsiniz.
- **Performans optimizasyonu:** Hibernate önbellekleme ve sorgu optimizasyonlarıyla verimli çalışır.
- **Veri tutarlılığı ve bütünlüğü sağlar:** Transaction yönetimi ile veri kaybı ve tutarsızlıkları engeller.
- **Veritabanı bağımsızlığı:** Farklı veritabanlarına kolayca uyum sağlar, projenizin taşınabilirliğini artırır.
- **Kod bakımını kolaylaştırır:** Karmaşık SQL kodları yerine nesne odaklı yapılar kullanılır.

ORM kullanımı, modern Java uygulamalarında veritabanı ile etkileşim için standart ve temiz bir yöntemdir.

---

### 4. Hibernate’de Transaction Yönetimi ve Önemi

**Transaction** bir veya daha fazla veritabanı işleminin tek bir birim olarak ele alınmasını sağlar. Transaction yönetimi veritabanı tutarlılığı için kritiktir.

Hibernate’de transaction yönetiminin önemi:

- **ACID özelliklerini sağlar:** Atomicity (bölünmezlik), Consistency (tutarlılık), Isolation (izolasyon), Durability (kalıcılık).
- **Hata durumunda geri alma (rollback):** İşlem başarısız olursa, tüm değişiklikler geri alınarak veritabanı bozulmaz.
- **Birden fazla işlemi tek seferde yönetir:** Örneğin, kayıt ekleme ve log tutma gibi eşzamanlı işlemler güvenle yapılır.
- **Hibernate API kullanımı:** `session.beginTransaction()`, `transaction.commit()`, `transaction.rollback()` metotları ile kontrol edilir.
- **Spring gibi framework’lerde otomatik yönetilebilir:** Ancak temel kavramların bilinmesi önemlidir.

Transaction yönetimi olmadan kısmi güncellemeler veri tutarsızlığına yol açabilir. Bu yüzden her veri değişikliği işlemi mutlaka transaction içinde yapılmalıdır.

---
