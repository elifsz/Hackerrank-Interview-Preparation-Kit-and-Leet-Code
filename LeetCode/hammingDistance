public static int hammingDistance(int x, int y) {
        int difference = 0;

        String strX = Integer.toBinaryString(x);
        String strY = Integer.toBinaryString(y);

        int len;
        int concatLen = Math.abs(strX.length() - strY.length());
        char[] concat = new char[concatLen];

        for (int i = 0; i < concatLen; i++) {
            concat[i] = '0';
        }
        String concatStrv = String.valueOf(concat);
        /*
        The shorter binary number must be prefixed with a 0 to equal the length of the other binary number.
        According to the Hamming Distance, if the characters of the String in the same index are different, they are counted.
         */
        if (strX.length() > strY.length()) {
            len = strX.length();
            strY = concatStrv + strY;
        } else {
            len = strY.length();
            strX = concatStrv + strX;
        }

        for (int i = 0; i < strX.length(); i++) {
            if (strX.charAt(i) != strY.charAt(i)) {
                difference++;
            }
        }
        return difference;
    }
