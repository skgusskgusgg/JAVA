package exec01;

import java.util.Scanner;

public class test13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 자판기 지옥
		/*
		 * 규칙 1) 먹고 싶은 메뉴 고르기(값) 2) 내가 가지고 있는돈 넣기 3) 만약 중간에 메뉴 더 고를수도 있음 4) 메뉴 총 합 구하기
		 * 5) 내가 넣은 돈에서 메뉴 합 빼기 6) 만약 돈이 부족하면 추가로 돈 넣기 (2)번으로 돌아가기 7) 음료수 & 거스름돈(없을수도있음.
		 * 그렇다면 거스름돈이없습니다. 출력) 받기 8) 관리자 페이지 9) 재고현황 10) 금액변경 11) 메뉴변경 12) 재고관리
		 */
		Scanner scan = new Scanner(System.in);
		String menu;
		String menuName = "";
		String yesOrNo;
		String cidar = "사이다";
		String coke = "콜라";
		String coffee = "커피";
		String juice = "쥬스";
		String login;
		String changeMenu;
		String modiCidar;
		String modiCoke;
		String modiCoffee;
		String modiJuice;
		int money = 0;
		int addMoney = 0;
		int price = 0;
		int cidarPrice = 1500;
		int cokePrice = 2000;
		int coffeePrice = 5000;
		int juicePrice = 3000;
		int cidarNum = 10;
		int cokeNum = 0;
		int coffeeNum = 20;
		int juiceNum = 19;
		int password = 0;
		int modifyMenu;
		int quantity;
		int priceWon;

		while (true) {
			System.out.println("====================Login====================");
			System.out.print("관리자 or 고객 or done(취소 시) : ");
			login = scan.next();
			if (login.equals("관리자")) {
				System.out.print("비밀번호를 입력하세요 : ");
				password = scan.nextInt();
				while (true) {
					if (password == 1234) {
						System.out.println("====================관리자창====================");
						System.out.println("" + "현재 재고 현황 : " + cidar + " " + cidarNum + "개, " + coke + " " + cokeNum
								+ "개, " + coffee + " " + coffeeNum + "개, " + juice + " " + juiceNum + "개");
						while (true) {
							if (cidarNum == 0) {
								System.out.print(cidar + "의 재고가 없습니다 채워주세요! : ");
								quantity = scan.nextInt();
								cidarNum = quantity;
								System.out.println(cidar + " : " + cidarNum + "개");
								break;
							} else if (cokeNum == 0) {
								System.out.print(coke + "의 재고가 없습니다 채워주세요! : ");
								quantity = scan.nextInt();
								cokeNum = quantity;
								System.out.println(coke + " : " + cokeNum + "개");
								break;
							} else if (coffeeNum == 0) {
								System.out.println(coffee + "의 재고가 없습니다 채워주세요! : ");
								quantity = scan.nextInt();
								coffeeNum = quantity;
								System.out.println(coffee + " : " + coffeeNum + "개");
								break;
							} else if (juiceNum == 0) {
								System.out.println(juice + "의 재고가 없습니다 채워주세요! : ");
								quantity = scan.nextInt();
								juiceNum = quantity;
								System.out.println(juice + " : " + juiceNum + "개");
								break;
							}
							break;
						}

						System.out.println("---------------------------------------------");
						System.out.println("변경하실 메뉴 이름을 선택해주세요");
						System.out.println("1)이름 2)수량 3)가격");
						System.out.println("-> 종료를 원하시면 close를 입력해주세요.");
						changeMenu = scan.next();

						if (changeMenu.equals("이름")) {
							System.out.println("이름을 수정 할 메뉴번호를 입력하세요 : ");
							modifyMenu = scan.nextInt();
							while (true) {
								switch (modifyMenu) {
								case 1:
									System.out.println("변경 전 이름은 " + cidar + "입니다.");
									System.out.println("변경하실 이름을 입력해주세요 : ");
									modiCidar = cidar;
									menu = scan.next();
									cidar = menu;
									if (modiCidar != cidar) {
										cidarNum = 0;
									}
									System.out.println();
									System.out.println("변경 후 이름은 " + cidar + "입니다.");
									break;
								case 2:
									System.out.println("변경 전 이름은 " + coke + "입니다.");
									System.out.print("변경하실 이름을 입력해주세요 : ");
									modiCoke = coke;
									menu = scan.next();
									coke = menu;
									if (modiCoke != coke) {
										cokeNum = 0;
									}
									System.out.println();
									System.out.println("변경 후 이름은 " + coke + "입니다.");
									break;
								case 3:
									System.out.println("변경 전 이름은 " + coffee + "입니다.");
									System.out.print("변경하실 이름을 입력해주세요 : ");
									modiCoffee = coffee;
									menu = scan.next();
									coffee = menu;
									if (modiCoffee != coffee) {
										coffeeNum = 0;
									}
									System.out.println();
									System.out.print("변경 후 이름은 " + coffee + "입니다.");
									break;
								case 4:
									System.out.println("변경 전 이름은 " + juice + "입니다.");
									System.out.print("변경하실 이름을 입력해주세요 : ");
									modiJuice = juice;
									menu = scan.next();
									juice = menu;
									if (modiJuice != juice) {
										juiceNum = 0;
									}
									System.out.println();
									System.out.print("변경 후 이름은 " + juice + "입니다.");
									break;
								}
								break;
							}
						} else if (changeMenu.equals("수량")) {
							System.out.println("수량을 수정 할 메뉴번호를 입력하세요 : ");
							modifyMenu = scan.nextInt();
							while (true) {
								switch (modifyMenu) {
								case 1:
									System.out.println("변경 전 " + cidar + "의 개수는 " + cidarNum + "개");
									System.out.println("변경하실 수량을 입력해주세요 : ");
									quantity = scan.nextInt();
									cidarNum = quantity;
									System.out.println();
									System.out.println("변경 후 " + cidar + "의 개수는 " + cidarNum + "개");
									break;
								case 2:
									System.out.println("변경 전 " + coke + "의 개수는 " + cokeNum + "개");
									System.out.println("변경하실 수량을 입력해주세요 : ");
									quantity = scan.nextInt();
									cokeNum = quantity;
									System.out.println();
									System.out.println("변경 후 " + coke + "의 개수는 " + cokeNum + "개");
									break;
								case 3:
									System.out.println("변경 전 " + coffee + "의 개수는 " + coffeeNum + "개");
									System.out.println("변경하실 수량을 입력해주세요 : ");
									quantity = scan.nextInt();
									coffeeNum = quantity;
									System.out.println();
									System.out.println("변경 후 " + coffee + "의 개수는 " + coffeeNum + "개");
									break;
								case 4:
									System.out.println("변경 전 " + juice + "의 개수는 " + juiceNum + "개");
									System.out.println("변경하실 수량을 입력해주세요 : ");
									quantity = scan.nextInt();
									juiceNum = quantity;
									System.out.println();
									System.out.println("변경 후 " + juice + "의 개수는 " + juiceNum + "개");
									break;
								}
								break;
							}
						} else if (changeMenu.equals("가격")) {
							System.out.println("가격 수정 할 메뉴번호를 입력하세요 : ");
							modifyMenu = scan.nextInt();
							while (true) {
								switch (modifyMenu) {
								case 1:
									System.out.println("변경 전 가격은 " + cidarPrice + "원");
									System.out.println("변경하실 가격을 입력해주세요 : ");
									priceWon = scan.nextInt();
									cidarPrice = priceWon;
									System.out.println();
									System.out.println("변경 후 가격은 " + cidarPrice + "원");
									break;
								case 2:
									System.out.println("변경 전 가격은 " + cokePrice + "원");
									System.out.println("변경하실 가격을 입력해주세요 : ");
									priceWon = scan.nextInt();
									cokePrice = priceWon;
									System.out.println();
									System.out.println("변경 후 가격은 " + coffeePrice + "원");
									break;
								case 3:
									System.out.println("변경 전 가격은 " + coffeePrice + "원");
									System.out.println("변경하실 가격을 입력해주세요 : ");
									priceWon = scan.nextInt();
									coffeePrice = priceWon;
									System.out.println();
									System.out.println("변경 후 가격은 " + coffeePrice + "원");
									break;
								case 4:
									System.out.println("변경 전 가격은 " + juicePrice + "원");
									System.out.println("변경하실 가격을 입력해주세요 : ");
									priceWon = scan.nextInt();
									juicePrice = priceWon;
									System.out.println();
									System.out.println("변경 후 가격은 " + juicePrice + "원");
									break;
								}
								break;
							}
						} else if (changeMenu.equals("close")) {
							break;
						} else {
							System.out.println("다시 입력해주세요. ");
							changeMenu = scan.next();
						}

					} else {
						System.out.println("비밀번호가 틀렸습니다! 다시 입력해주세요.");
						password = scan.nextInt();
					}
				}

			} else if (login.equals("고객")) {
				System.out.println("====================고객창====================");
				System.out.print("돈을 넣어주세요 : ");
				System.out.println("현재 잔액 : " + (money));

				addMoney = scan.nextInt();
				money += addMoney;

				System.out.println("====================메뉴====================");
				System.out.println("메뉴 1) " + cidar + " : " + cidarPrice + "원 / " + "메뉴 2) " + coke + " : " + cokePrice
						+ "원 / " + "메뉴 3) " + coffee + " : " + coffeePrice + "원 / " + "메뉴 4) " + juice + " : "
						+ juicePrice + "원 ");

				System.out.println("-> 종료를 원하시면 close를 입력해주세요.");
				System.out.println("===========================================");

				System.out.print("먹고 싶은 메뉴를 골라주세요 : ");
				menu = scan.next();

				System.out.println("-------------------------------------------");
				while (true) {
					switch (menu) {
					case "1":
						if (cidarNum == 0) {
							System.out.println(cidar + "가 품절되었습니다.");
							break;
						}
						menuName = menuName + cidar + " ";
						cidarNum--;
						price += cidarPrice;

						break;
					case "2":
						if (cokeNum == 0) {
							System.out.println(coke + "가 품절되었습니다.");
							break;
						}
						menuName = menuName + coke + " ";
						price += cokePrice;
						cokeNum--;
						break;
					case "3":
						if (coffeeNum == 0) {
							System.out.println(coffee + "가 품절되었습니다.");
							break;
						}
						menuName = menuName + coffee + " ";
						price += coffeePrice;
						coffeeNum--;
						break;
					case "4":
						if (juiceNum == 0) {
							System.out.println(juice + "가 품절되었습니다.");
							break;
						}
						menuName = menuName + juice + " ";
						price += juicePrice;
						juiceNum--;
						break;
					}
					if (menu.equals("close")) {
						break;
					}

					System.out.println("현재 잔액 : " + (money - price) + ", 내가 선택한 메뉴 : " + menuName);
					System.out.println("-------------------------------------------");
					System.out.print("음료를 추가하시겠습니까? (추가 시 'o'입력 / 종료 시 'x'입력 / 나가기를 원하시면 close를 입력해주세요.)");
					yesOrNo = scan.next();
					System.out.println("-------------------------------------------");

					if (yesOrNo.equals("close")) {
						break;
					}

					if (yesOrNo.equals("o")) {
						System.out.println("====================메뉴====================");
						System.out.println("메뉴 1) " + cidar + " : " + cidarPrice + "원 / " + "메뉴 2) " + coke + " : "
								+ cokePrice + "원 / " + "메뉴 3) " + coffee + " : " + coffeePrice + "원 / " + "메뉴 4) "
								+ juice + " : " + juicePrice + "원");
						System.out.print("추가할 메뉴를 다시 선택해주세요. : ");
						menu = scan.next();
						System.out.println("========================================");
					} else if (yesOrNo.equals("x")) {
						if (money < price && money != 0) {
							System.out.println("잔액이 부족합니다." + (price - money) + "원을 더 넣어주세요");
							addMoney = scan.nextInt();
							money += addMoney;

							if (money == price) {
								System.out.println("거스름 돈이 없습니다. " + menuName + "가 나왔습니다.");
								break;
							}
							String moneyidx = Integer.toString(money);
							String one;
							String two;

							int fiveNum = 0;
							int oneNum = 0;

							one = moneyidx.substring(0, 1);
							two = moneyidx.substring(1, 2);

							int won = Integer.parseInt(two);
							if (money >= 10000) {
								one = moneyidx.substring(0, 2);
								two = moneyidx.substring(2, 3);
								won = Integer.parseInt(two);
							}

							if (won >= 5) {
								fiveNum += 1;
								oneNum = won - 5;
							} else {
								oneNum = won;
							}
							moneyidx = Integer.toString(money);
							System.out.println("1000원권 : " + one + "장, " + "500원권 : " + fiveNum + "개," + " 100원권 : "
									+ oneNum + "개");
							System.out.println(menuName + "가 나왔습니다. 거스름 돈 " + (money - price) + "원이 남았습니다.");
							price = 0;
							break;
						} else {
							money = money - price;
							if (money == 0) {
								System.out.println("거스름 돈이 없습니다. " + menuName + "가 나왔습니다.");
								break;
							}
							String moneyidx = Integer.toString(money);
							String one;
							String two;

							int fiveNum = 0;
							int oneNum = 0;

							one = moneyidx.substring(0, 1);
							two = moneyidx.substring(1, 2);

							int won = Integer.parseInt(two);
							if (money >= 10000) {
								one = moneyidx.substring(0, 2);
								two = moneyidx.substring(2, 3);
								won = Integer.parseInt(two);
							}
							if (won >= 5) {
								fiveNum += 1;
								oneNum = won - 5;
							} else {
								oneNum = won;
							}
							moneyidx = Integer.toString(money);
							System.out.println("1000원권 : " + one + "장, " + "500원권 : " + fiveNum + "개," + " 100원권 : "
									+ oneNum + "개");
							System.out.println(menuName + "가 나왔습니다.");
							System.out.println("현재잔액이 " + money + "원 남았습니다.");
							price = 0;
							break;
						}

					} else {
						System.out.println("다시 입력해주세요.");
					}
				}
			} else if (login.equals("done")) {
				System.out.println("========================================");
				System.out.println("자판기가 종료되었습니다");
				break;
			}

		}

	}

}
