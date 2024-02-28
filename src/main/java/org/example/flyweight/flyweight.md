# Flyweight


Flyweight, tüm verileri bir nesnede tutmak yerine
ortak durum parçalarını birden fazla nesne arasında
paylaşarak mevcut RAM miktarına daha fazla nesne 
sığdırmamızı sağlayan yapısal bir tasarım modelidir.

### Problem
Örneğin bir oyun geliştiriyoruz.
Bir mermi, bir füze veya bir şarapnel parçası gibi 
her bir parçacık, bol miktarda veri içeren ayrı bir 
nesne tarafından temsil ediliyor diyelim.
Her bir parça için yeni bir obje oluşturuluyor.
Bir noktada, oyuncunun ekranındaki katliam doruk noktasına 
ulaştığında, çok fazla bellek maliyetine neden olacaktır.
Yeni oluşturulan parçacıklar artık
kalan RAM'e sığmayabir, bu nedenle program çökebilir.

![](https://refactoring.guru/images/patterns/diagrams/flyweight/problem-en.png?id=7cfc97e5bf1cb38274c93823447cf17e)


### Çözüm

Particle sınıfı incelendiğinde color ve sprite alanları fazla bellek tükketiği fark edilecektir.
Aynı zamanda bu alanlar tüm oluşturulacak parçacıklarda aynı değere sahiptir.
Bu yüzden sürekli alanları oluşturmaya gerek yoktur. Particle nesnesini
Flyweight tasarım kalıbının da dediği gibi bölmek avantaj sağlayacaktır.

![](https://refactoring.guru/images/patterns/diagrams/flyweight/solution1-en.png?id=4b962ce51832e49a24f16f36be79ec45)

Bir nesnenin bu sabit verilerine genellikle **içsel durum (intrinsic state)** denir.
Nesnenin içinde yaşar; diğer nesneler onu yalnızca okuyabilir, değiştiremez.
Bu örneğimizde içsel durum color ve sprite alanlarıdır.
Duruma göre değişen ve benzersiz olan verilere ise **dışsal durum(extrinsic state)** denir.
Bu örneğimizde coords, vector ve speed dışsal durumdur.

![](https://refactoring.guru/images/patterns/diagrams/flyweight/solution3-en.png?id=e861e35c1214c46ac7333a127462de68)



