# 원주율 구하는 알고리즘 테스트
원주율 값을 구하는 방법은 다양합니다만 여기서는 테일러전개에서 나오는 급수를 이용하는 방법을 사용합니다.
<https://terms.naver.com/entry.naver?docId=3350296&cid=60210&categoryId=60210>
# 싱글 쓰레드와 멀티 쓰레드
먼저 싱글 쓰레드로 10회 테스트를 하고, 멀티 쓰레드로 10개의 쓰레드를 만들어 테스트를 합니다.
## 조립 데스크탑 컴퓨터 / Windows 10 Pro / Intel i7-7700K CPU @ 4.20GHz / RAM 16GB
```
Test Single-thread
Calculated PI = 3.141592663589326, time elapsed = 5315
Calculated PI = 3.141592663589326, time elapsed = 5232
Calculated PI = 3.141592663589326, time elapsed = 5263
Calculated PI = 3.141592663589326, time elapsed = 5248
Calculated PI = 3.141592663589326, time elapsed = 5290
Calculated PI = 3.141592663589326, time elapsed = 5245
Calculated PI = 3.141592663589326, time elapsed = 5265
Calculated PI = 3.141592663589326, time elapsed = 5270
Calculated PI = 3.141592663589326, time elapsed = 5252
Calculated PI = 3.141592663589326, time elapsed = 5271
Test Multi-thread
Calculated PI = 3.141592663589326, time elapsed = 13748
Calculated PI = 3.141592663589326, time elapsed = 13789
Calculated PI = 3.141592663589326, time elapsed = 13791
Calculated PI = 3.141592663589326, time elapsed = 13846
Calculated PI = 3.141592663589326, time elapsed = 13924
Calculated PI = 3.141592663589326, time elapsed = 13972
Calculated PI = 3.141592663589326, time elapsed = 14048
Calculated PI = 3.141592663589326, time elapsed = 14049
Calculated PI = 3.141592663589326, time elapsed = 14011
Calculated PI = 3.141592663589326, time elapsed = 14116
```
## MacBook Pro (Retina, 15-inch, Mid 2015) / Big Sur 11.1 / Intel i7 쿼드코어 CPU @ 2.8GHz / RAM 16GB
```
Test Single-thread
Calculated PI = 3.141592663589326, time elapsed = 3951
Calculated PI = 3.141592663589326, time elapsed = 3585
Calculated PI = 3.141592663589326, time elapsed = 3537
Calculated PI = 3.141592663589326, time elapsed = 3527
Calculated PI = 3.141592663589326, time elapsed = 3508
Calculated PI = 3.141592663589326, time elapsed = 3515
Calculated PI = 3.141592663589326, time elapsed = 3509
Calculated PI = 3.141592663589326, time elapsed = 3511
Calculated PI = 3.141592663589326, time elapsed = 3509
Calculated PI = 3.141592663589326, time elapsed = 3515
Test Multi-thread
Calculated PI = 3.141592663589326, time elapsed = 8582
Calculated PI = 3.141592663589326, time elapsed = 8595
Calculated PI = 3.141592663589326, time elapsed = 8602
Calculated PI = 3.141592663589326, time elapsed = 8604
Calculated PI = 3.141592663589326, time elapsed = 8596
Calculated PI = 3.141592663589326, time elapsed = 8608
Calculated PI = 3.141592663589326, time elapsed = 8611
Calculated PI = 3.141592663589326, time elapsed = 8603
Calculated PI = 3.141592663589326, time elapsed = 8613
Calculated PI = 3.141592663589326, time elapsed = 8624
```
## ASUS ROG Zephyrus G14 / Windows 10 Home / AMD Ryzen 9 5900HS / RAM 16GB
```
Test Single-thread
Calculated PI = 3.141592663589326, time elapsed = 3612
Calculated PI = 3.141592663589326, time elapsed = 3608
Calculated PI = 3.141592663589326, time elapsed = 3458
Calculated PI = 3.141592663589326, time elapsed = 3455
Calculated PI = 3.141592663589326, time elapsed = 3470
Calculated PI = 3.141592663589326, time elapsed = 3457
Calculated PI = 3.141592663589326, time elapsed = 3465
Calculated PI = 3.141592663589326, time elapsed = 3460
Calculated PI = 3.141592663589326, time elapsed = 3463
Calculated PI = 3.141592663589326, time elapsed = 3458
Test Multi-thread
Calculated PI = 3.141592663589326, time elapsed = 3837
Calculated PI = 3.141592663589326, time elapsed = 4110
Calculated PI = 3.141592663589326, time elapsed = 4152
Calculated PI = 3.141592663589326, time elapsed = 4292
Calculated PI = 3.141592663589326, time elapsed = 4333
Calculated PI = 3.141592663589326, time elapsed = 4393
Calculated PI = 3.141592663589326, time elapsed = 4441
Calculated PI = 3.141592663589326, time elapsed = 4856
Calculated PI = 3.141592663589326, time elapsed = 4876
Calculated PI = 3.141592663589326, time elapsed = 5001
```
## Samsung NT900X5T / Windows 10 Home / Intel i7-8550U @ 1.80GHz 1.99GHz / RAM 16GB
```
Test Single-thread
Calculated PI = 3.141592663589326, time elapsed = 7824
Calculated PI = 3.141592663589326, time elapsed = 8721
Calculated PI = 3.141592663589326, time elapsed = 7802
Calculated PI = 3.141592663589326, time elapsed = 7435
Calculated PI = 3.141592663589326, time elapsed = 7572
Calculated PI = 3.141592663589326, time elapsed = 7630
Calculated PI = 3.141592663589326, time elapsed = 9331
Calculated PI = 3.141592663589326, time elapsed = 8389
Calculated PI = 3.141592663589326, time elapsed = 7475
Calculated PI = 3.141592663589326, time elapsed = 8053
Test Multi-thread
Calculated PI = 3.141592663589326, time elapsed = 19640
Calculated PI = 3.141592663589326, time elapsed = 19671
Calculated PI = 3.141592663589326, time elapsed = 19734
Calculated PI = 3.141592663589326, time elapsed = 19672
Calculated PI = 3.141592663589326, time elapsed = 19834
Calculated PI = 3.141592663589326, time elapsed = 20348
Calculated PI = 3.141592663589326, time elapsed = 20500
Calculated PI = 3.141592663589326, time elapsed = 20500
Calculated PI = 3.141592663589326, time elapsed = 20510
Calculated PI = 3.141592663589326, time elapsed = 20616
```