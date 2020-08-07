public class Testes {
    public static void executar() {

        int numErros = 0;

        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");

        System.out.println("\nIniciando testes -- Nao necessariamente todos os casos foram testados -- Confira a classe Testes para mais detalhes");

        if (!teste1()) {
            System.out.println("Ocorreu um erro no teste 1");
            numErros++;
        }
        if (!teste2()) {
            System.out.println("Ocorreu um erro no teste 2");
            numErros++;
        }
        if (!teste3()) {
            System.out.println("Ocorreu um erro no teste 3");
            numErros++;
        }
        if (!teste4()) {
            System.out.println("Ocorreu um erro no teste 4");
            numErros++;
        }
        if (!teste5()) {
            System.out.println("Ocorreu um erro no teste 5");
            numErros++;
        }
        if (!teste6()) {
            System.out.println("Ocorreu um erro no teste 6");
            numErros++;
        }
        if (!teste7()) {
            System.out.println("Ocorreu um erro no teste 7");
            numErros++;
        }
        if (!teste8()) {
            System.out.println("Ocorreu um erro no teste 8");
            numErros++;
        }
        if (!teste9()) {
            System.out.println("Ocorreu um erro no teste 9");
            numErros++;
        }
        if (!teste10()) {
            System.out.println("Ocorreu um erro no teste 10");
            numErros++;
        }
        if (!teste11()) {
            System.out.println("Ocorreu um erro no teste 11");
            numErros++;
        }
        if (!teste12()) {
            System.out.println("Ocorreu um erro no teste 12");
            numErros++;
        }

        if (numErros == 0) {
            System.out.println("Nao foram registrados erros");
        }

        System.out.println("Consulte a classe Testes para mais detalhes\n");

        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n");
    }


    // Teste 1: Testa o metodo adicionarCliente() da classe Gerente
    public static boolean teste1() {
        Cliente[] clientes = new Cliente[21];
        
        // Instanciando gerentes
        Gerente g1 = new Gerente("G1", 91111);
        
        // Instanciando clientes
        Cliente c1 = new Cliente("A", 11111, 10000);
        clientes[0] = c1;
        Cliente c2 = new Cliente("B", 11112, 10000);
        clientes[1] = c2;
        Cliente c3 = new Cliente("C", 11113, 10000);
        clientes[2] = c3;
        Cliente c4 = new Cliente("D", 11114, 10000);
        clientes[3] = c4;
        Cliente c5 = new Cliente("E", 11115, 10000);
        clientes[4] = c5;
        Cliente c6 = new Cliente("F", 11116, 10000);
        clientes[5] = c6;
        Cliente c7 = new Cliente("G", 11117, 10000);
        clientes[6] = c7;
        Cliente c8 = new Cliente("H", 11118, 10000);
        clientes[7] = c8;
        Cliente c9 = new Cliente("I", 11119, 10000);
        clientes[8] = c9;
        Cliente c10 = new Cliente("J", 11120, 10000);
        clientes[9] = c10;
        Cliente c11 = new Cliente("K", 11121, 10000);
        clientes[10] = c11;
        Cliente c12 = new Cliente("L", 11122, 10000);
        clientes[11] = c12;
        Cliente c13 = new Cliente("M", 11123, 10000);
        clientes[12] = c13;
        Cliente c14 = new Cliente("N", 11124, 10000);
        clientes[13] = c14;
        Cliente c15 = new Cliente("O", 11125, 10000);
        clientes[14] = c15;
        Cliente c16 = new Cliente("P", 11126, 10000);
        clientes[15] = c16;
        Cliente c17 = new Cliente("Q", 11127, 10000);
        clientes[16] = c17;
        Cliente c18 = new Cliente("R", 11128, 10000);
        clientes[17] = c18;
        Cliente c19 = new Cliente("S", 11129, 10000);
        clientes[18] = c19;
        Cliente c20 = new Cliente("T", 11130, 10000);
        clientes[19] = c20;
        Cliente c21 = new Cliente("U", 11131, 10000);
        clientes[20] = c21;

        for (int i = 0; i < 20; i++) {
            if (!g1.adicionarCliente(clientes[i])) return false;
        }

        if (g1.adicionarCliente(clientes[20])) return false;

        return true;
    }

    // Teste 2: Testa o metodo adicionarGerente() da classe Banco
    public static boolean teste2() {
        Gerente[] gerentes = new Gerente[11];

        // Instanciando um banco
        Banco itau = new Banco();

        // Instanciando gerentes
        Gerente g1 = new Gerente("G1", 91111);
        gerentes[0] = g1;
        Gerente g2 = new Gerente("G2", 91112);
        gerentes[1] = g2;
        Gerente g3 = new Gerente("G3", 91113);
        gerentes[2] = g3;
        Gerente g4 = new Gerente("G4", 91114);
        gerentes[3] = g4;
        Gerente g5 = new Gerente("G5", 91115);
        gerentes[4] = g5;
        Gerente g6 = new Gerente("G6", 91116);
        gerentes[5] = g6;
        Gerente g7 = new Gerente("G7", 91117);
        gerentes[6] = g7;
        Gerente g8 = new Gerente("G8", 91118);
        gerentes[7] = g8;
        Gerente g9 = new Gerente("G9", 91119);
        gerentes[8] = g9;
        Gerente g10 = new Gerente("G10", 91120);
        gerentes[9] = g10;
        Gerente g11 = new Gerente("G11", 91121);
        gerentes[10] = g11;

        for (int i = 0; i < 10; i++) {
            if (!itau.adicionarGerente(gerentes[i])) return false;
        }

        if (itau.adicionarGerente(gerentes[10])) return false;

        return true;
    }

    // Teste 3: Tenta adicionar dois clientes com o mesmo cpf
    public static boolean teste3() {
        // Instanciando um gerente
        Gerente g1 = new Gerente("G1", 91111);

        // Intanciando clientes
        Cliente c1 = new Cliente("C1", 11111, 12500);
        Cliente c2 = new Cliente("C2", 11111, 3500);

        g1.adicionarCliente(c1);
        
        if (g1.adicionarCliente(c2)) return false;

        return true;
    }

    // Teste 4: Tenta adicionar dois gerentes com o mesmo cpf
    public static boolean teste4() {
        // Instanciando um banco
        Banco itau = new Banco();

        //Instanciando gerentes
        Gerente g1 = new Gerente("G1", 91111);
        Gerente g2 = new Gerente("G2", 91111);

        itau.adicionarGerente(g1);
        
        if (itau.adicionarGerente(g2)) return false;

        return true;
    }

    // Teste 5: Testa o metodo cobrarTodosEmprestimos() da classe Gerente
    public static boolean teste5() {
        // Instanciando um gerente
        Gerente g1 = new Gerente("G1", 91111);

        // Instanciando clientes
        Cliente c1 = new Cliente("C1", 11111, 3000);
        g1.adicionarCliente(c1);
        Cliente c2 = new Cliente("C2", 11112, 1000);
        g1.adicionarCliente(c2);
        Cliente c3 = new Cliente("C3", 11113, 10000);
        g1.adicionarCliente(c3);
        Cliente c4 = new Cliente("C4", 11114, 5000);
        g1.adicionarCliente(c4);
        Cliente c5 = new Cliente("C5", 11115, 6000);
        g1.adicionarCliente(c5);

        c1.obterEmprestimo(1000);
        c2.obterEmprestimo(4000);
        c3.obterEmprestimo(10000);
        c4.obterEmprestimo(1000);

        c4.realizarSaque(5500);

        g1.cobrarTodosEmprestimos();

        boolean testeC1 = c1.getValorDaDivida() == 0 && c1.getValorContaCorrente() == 3000;
        boolean testeC2 = c2.getValorDaDivida() == 0 && c2.getValorContaCorrente() == 1000;
        boolean testeC3 = c3.getValorDaDivida() == 0 && c3.getValorContaCorrente() == 10000;
        boolean testeC4 = c4.getValorDaDivida() == 500 && c4.getValorContaCorrente() == 0;
        boolean testeC5 = c5.getValorDaDivida() == 0 && c5.getValorContaCorrente() == 6000;
        
        if (testeC1 && testeC2 && testeC3 && testeC4 && testeC5) return true;

        System.out.println("Teste 5 - Erro");
        System.out.println("C1 - Esperado: 0 3000\tObtido: " + c1.getValorDaDivida() + " " + c1.getValorContaCorrente());
        System.out.println("C2 - Esperado: 0 1000\tObtido: " + c2.getValorDaDivida() + " " + c2.getValorContaCorrente());
        System.out.println("C3 - Esperado: 0 10000\tObtido: " + c3.getValorDaDivida() + " " + c3.getValorContaCorrente());
        System.out.println("C4 - Esperado: 500 0\tObtido: " + c4.getValorDaDivida() + " " + c4.getValorContaCorrente());
        System.out.println("C5 - Esperado: 0 6000\tObtido: " + c5.getValorDaDivida() + " " + c5.getValorContaCorrente());
        
        return false;
    }

    // Teste 6: Testa o metodo obterEmprestimo() da classe Cliente
    public static boolean teste6() {
        // Instanciando um gerente
        Gerente g1 = new Gerente("G1", 91111);
        
        // Instanciando clientes
        Cliente c1 = new Cliente("C1", 11111, 3000);
        g1.adicionarCliente(c1);
        Cliente c2 = new Cliente("C2", 11112, 1000);
        g1.adicionarCliente(c2);
        Cliente c3 = new Cliente("C3", 11113, 10000);
        g1.adicionarCliente(c3);
        Cliente c4 = new Cliente("C4", 11114, 5000);
        g1.adicionarCliente(c4);
        Cliente c5 = new Cliente("C5", 11115, 6000);
        g1.adicionarCliente(c5);

        if (c1.obterEmprestimo(-10)) return false;
        if (!c2.obterEmprestimo(3000)) return false;
        if (c3.obterEmprestimo(40000)) return false;
        if (!c4.obterEmprestimo(30000)) return false;
        if (c4.obterEmprestimo(10)) return false;
        if (c4.obterEmprestimo(-10)) return false;
        if (c5.obterEmprestimo(0)) return false;

        boolean testeC1 = c1.getValorDaDivida() == 0 && c1.getValorContaCorrente() == 3000;
        boolean testeC2 = c2.getValorDaDivida() == 3000 && c2.getValorContaCorrente() == 4000;
        boolean testeC3 = c3.getValorDaDivida() == 0 && c3.getValorContaCorrente() == 10000;
        boolean testeC4 = c4.getValorDaDivida() == 30000 && c4.getValorContaCorrente() == 35000;
        boolean testeC5 = c5.getValorDaDivida() == 0 && c5.getValorContaCorrente() == 6000;

        if (testeC1 && testeC2 && testeC3 && testeC4 && testeC5) return true;

        System.out.println("Teste 6 - Erro");
        System.out.println("C1 - Esperado: 0 3000\tObtido: " + c1.getValorDaDivida() + " " + c1.getValorContaCorrente());
        System.out.println("C2 - Esperado: 3000 4000\tObtido: " + c2.getValorDaDivida() + " " + c2.getValorContaCorrente());
        System.out.println("C3 - Esperado: 0 10000\tObtido: " + c3.getValorDaDivida() + " " + c3.getValorContaCorrente());
        System.out.println("C4 - Esperado: 30000 35000\tObtido: " + c4.getValorDaDivida() + " " + c4.getValorContaCorrente());
        System.out.println("C5 - Esperado: 0 6000\tObtido: " + c5.getValorDaDivida() + " " + c5.getValorContaCorrente());

        return false;
    }

    // Teste 7: Testa o metodo pagarEmprestimo() da classe Cliente
    public static boolean teste7() {
        // Instanciando um gerente
        Gerente g1 = new Gerente("G1", 91111);

        // Instanciando clientes
        Cliente c1 = new Cliente("C1", 11111, 3000);
        g1.adicionarCliente(c1);
        Cliente c2 = new Cliente("C2", 11112, 1000);
        g1.adicionarCliente(c2);
        Cliente c3 = new Cliente("C3", 11113, 10000);
        g1.adicionarCliente(c3);
        Cliente c4 = new Cliente("C4", 11114, 5000);
        g1.adicionarCliente(c4);
        Cliente c5 = new Cliente("C5", 11115, 6000);
        g1.adicionarCliente(c5);

        c1.obterEmprestimo(10);
        c2.obterEmprestimo(1000);
        c3.obterEmprestimo(100);
        c4.obterEmprestimo(100);

        if (c1.pagarEmprestimo(0)) return false;
        if (!c1.pagarEmprestimo(10)) return false;
        if (c2.pagarEmprestimo(-10)) return false;
        if (c3.pagarEmprestimo(1000)) return false;
        if (c4.pagarEmprestimo(6000)) return false;
        if (!c4.pagarEmprestimo(50)) return false;
        if (c5.pagarEmprestimo(100)) return false;

        boolean testeC1 = c1.getValorDaDivida() == 0 && c1.getValorContaCorrente() == 3000;
        boolean testeC2 = c2.getValorDaDivida() == 1000 && c2.getValorContaCorrente() == 2000;
        boolean testeC3 = c3.getValorDaDivida() == 100 && c3.getValorContaCorrente() == 10100;
        boolean testeC4 = c4.getValorDaDivida() == 50 && c4.getValorContaCorrente() == 5050;
        boolean testeC5 = c5.getValorDaDivida() == 0 && c5.getValorContaCorrente() == 6000;

        if (testeC1 && testeC2 && testeC3 && testeC4 && testeC5) return true;

        System.out.println("Teste 7 - Erro");
        System.out.println("C1 - Esperado: 0 3000\tObtido: " + c1.getValorDaDivida() + " " + c1.getValorContaCorrente());
        System.out.println("C2 - Esperado: 1000 2000\tObtido: " + c2.getValorDaDivida() + " " + c2.getValorContaCorrente());
        System.out.println("C3 - Esperado: 100 10100\tObtido: " + c3.getValorDaDivida() + " " + c3.getValorContaCorrente());
        System.out.println("C4 - Esperado: 50 5050\tObtido: " + c4.getValorDaDivida() + " " + c4.getValorContaCorrente());
        System.out.println("C5 - Esperado: 0 6000\tObtido: " + c5.getValorDaDivida() + " " + c5.getValorContaCorrente());

        return false;
    }

    // Teste 8: Testa o metodo negativado() da classe Cliente
    public static boolean teste8() {
        // Instanciando um gerente
        Gerente g1 = new Gerente("G1", 91111);

        // Instanciando clientes
        Cliente c1 = new Cliente("C1", 11111, 3000);
        g1.adicionarCliente(c1);
        Cliente c2 = new Cliente("C2", 11112, 1000);
        g1.adicionarCliente(c2);
        Cliente c3 = new Cliente("C3", 11113, 10000);
        g1.adicionarCliente(c3);

        c1.obterEmprestimo(2000);
        c2.obterEmprestimo(1000);
        c3.obterEmprestimo(12000);

        c2.realizarSaque(1000);
        c3.realizarSaque(12000);

        if (!c1.negativado() && !c2.negativado() && c3.negativado()) return true;

        System.out.println("Teste 8 - Erro");
        System.out.println("C1 - Esperado: false\tObtido: " + c1.negativado());
        System.out.println("C2 - Esperado: false\tObtido: " + c2.negativado());
        System.out.println("C3 - Esperado: true\tObtido: " + c3.negativado());

        return false;
    }

    // Teste 9: Testa o metodo realizarSaque() da classe Cliente
    public static boolean teste9() {
        // Instanciando um gerente
        Gerente g1 = new Gerente("G1", 91111);

        // Instanciando clientes
        Cliente c1 = new Cliente("C1", 11111, 3000);
        g1.adicionarCliente(c1);
        Cliente c2 = new Cliente("C2", 11112, 1000);
        g1.adicionarCliente(c2);
        Cliente c3 = new Cliente("C3", 11113, 10000);
        g1.adicionarCliente(c3);
        Cliente c4 = new Cliente("C4", 11114, 5000);
        g1.adicionarCliente(c4);
        Cliente c5 = new Cliente("C5", 11115, 6000);
        g1.adicionarCliente(c5);

        if (c1.realizarSaque(-10)) return false;
        if (c2.realizarSaque(0)) return false;
        if (c3.realizarSaque(12000)) return false;
        if (!c4.realizarSaque(3000)) return false;
        if (!c5.realizarSaque(10)) return false;

        boolean testeC4 = c4.getValorContaCorrente() == 2000;
        boolean testeC5 = c5.getValorContaCorrente() == 5990;

        if (testeC4 && testeC5) return true;

        return false;
    }

    // Teste 10: Testa o metodo obterEmprestimo da classe ClienteEspecial
    public static boolean teste10() {
        ClienteEspecial c1 = new ClienteEspecial("C1", 11111, 50000);
        Cliente c2 = new ClienteEspecial("C2", 11112, 10000);

        if (c1.obterEmprestimo(60000)) return false;
        // aqui
        if (!c2.obterEmprestimo(40000)) return false;
        
        boolean testeC1 = c1.getValorDaDivida() == 0 && c1.getValorContaCorrente() == 50000;
        boolean testeC2 = c2.getValorDaDivida() == 40000 && c2.getValorContaCorrente() == 50000;

        if (testeC1 && testeC2) return true;

        return false;
    }

    // Teste 11: Tenta adicionar dois clientes com o mesmo nome
    public static boolean teste11() {
        // Instanciando um gerente
        Gerente g1 = new Gerente("G1", 91111);

        // Intanciando clientes
        Cliente c1 = new Cliente("C1", 11111, 12500);
        Cliente c2 = new Cliente("C1", 11112, 3500);

        g1.adicionarCliente(c1);
        
        if (!g1.adicionarCliente(c2)) return false;

        return true;
    }

    // Teste 12: Tenta adicionar dois gerentes com o mesmo nome
    public static boolean teste12() {
        // Instanciando um banco
        Banco itau = new Banco();

        //Instanciando gerentes
        Gerente g1 = new Gerente("G1", 91111);
        Gerente g2 = new Gerente("G1", 91112);

        itau.adicionarGerente(g1);
        
        if (!itau.adicionarGerente(g2)) return false;

        return true;
    }
}