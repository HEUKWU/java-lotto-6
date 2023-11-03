package lotto;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        LottoManager lottoManager = new LottoManager();
        lottoManager.start();

        User user = new User(lottoManager.getPrice());

        lottoManager.printLottos(user);
        Lotto lotto = lottoManager.createUserNumbers();
        System.out.println(lotto.getNumbers());
    }
}