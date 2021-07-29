# 원주율 구하는 알고리즘 테스트
원주율 값을 구하는 방법은 다양합니다만 여기서는 테일러전개에서 나오는 급수를 이용하는 방법을 사용합니다.
<https://terms.naver.com/entry.naver?docId=3350296&cid=60210&categoryId=60210>
# 싱글 쓰레드와 멀티 쓰레드
먼저 싱글 쓰레드로 10회 테스트를 하고, 멀티 쓰레드로 10개의 쓰레드를 만들어 테스트를 합니다.
## Windows 10 Pro / Intel i7-7700K CPU @ 4.20GHz / RAM 16GB
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
