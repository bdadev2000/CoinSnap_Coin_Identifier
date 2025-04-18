package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network.dex */
public final class Et {
    public static String[] A04 = {"QJblDe3wVK6feXal4ldrY3QcOGG4UkHt", "2zepy1PmZTCf4jSxyWiaVOuG1uYDUhxq", "yYSZkIRTXInaVK1F9QQ9YZR4hxi7L96x", "9Bt0bU", "BsbuUwvwQ1kbtWiwTekQfziPaSue0dsw", "yLqexVAazno3TL8TDAW38tYF3t4XrW", "8DUKE7RXBSYmkSj7feSXhV2S4GEg6t2h", "8s5VPXlVl4Lwrm8gOC5ZhnLqGhthAU"};
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;

    public Et(int i2) {
        this(i2, -1L);
    }

    public Et(int i2, int i3, int i4, long j2) {
        this.A02 = i2;
        this.A00 = i3;
        this.A01 = i4;
        this.A03 = j2;
    }

    public Et(int i2, long j2) {
        this(i2, -1, -1, j2);
    }

    public final Et A00(int i2) {
        if (this.A02 == i2) {
            return this;
        }
        return new Et(i2, this.A00, this.A01, this.A03);
    }

    public final boolean A01() {
        return this.A00 != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Et et = (Et) obj;
        if (this.A02 == et.A02 && this.A00 == et.A00) {
            int i2 = this.A01;
            String[] strArr = A04;
            if (strArr[2].charAt(6) != strArr[6].charAt(6)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[7] = "3akbSKdkYbqYqb8XM8EoWhMtdFIZ3n";
            strArr2[5] = "92eUK6p4zC0e1AjStm6aKeEHBLYU05";
            if (i2 == et.A01 && this.A03 == et.A03) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int result = this.A02;
        int result2 = ((((17 * 31) + result) * 31) + this.A00) * 31;
        int result3 = this.A01;
        return ((result2 + result3) * 31) + ((int) this.A03);
    }
}
