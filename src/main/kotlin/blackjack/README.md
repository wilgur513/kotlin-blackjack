# 🚀 2단계 - 블랙잭

## 기능 요구 사항 체크리스트

* BlackJackGame

- [x] 게임이 시작되면 플레이어에게 랜덤한 카드를 2장씩 나눠준다.
- [x] 플레이어가 카드 뽑는것을 선택하면 카드를 1장 나눠준다.
- [x] 플레이어의 카드합이 21이 넘으면 PlayerLoseException를 throw한다.

* RuleChecker

- [x] 카드 숫자 합이 21이 넘는지 검사한다.


* Card

- [x] 카드는 문양과 숫자를 가진다.

* Deck

- [x] Card의 cardShape와 cardNumber의 조합이 중복되지 않는 Card 리스트를 가진다.
- [x] 남은 카드가 없으면 IllegaArgumentException을 throw 한다.

* Player

- [x] 플레이어는 이름을 가진다.
- 플레이어는 뽑은 카드 리스트를 가지고 있다.
    - [x] 플레이어는 뽑은 카드를 한번에 한장 씩 추가할 수 있다.
    - [x] 플레이어는 뽑은 카드를 한번에 여러장 씩 추가할 수 있다.
-[x] 이름 리스트를 입력으면 이름을 가지는 플레이어 리스트를 생성한다.


* CardNumberCalculator

- [x] 카드 리스트 숫자의 합을 계산한다.
    - [x] 카드의 숫자 계산은 카드 숫자를 기본으로 한다.
    - [x] King, Queen, Jack은 각각 10으로 계산한다.
    - [x] Ace는 1 또는 11로 계산할 수 있다.