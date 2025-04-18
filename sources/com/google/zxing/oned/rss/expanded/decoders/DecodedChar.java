package com.google.zxing.oned.rss.expanded.decoders;

/* loaded from: classes4.dex */
final class DecodedChar extends DecodedObject {
    static final char FNC1 = '$';
    private final char value;

    public DecodedChar(int i2, char c2) {
        super(i2);
        this.value = c2;
    }

    public char getValue() {
        return this.value;
    }

    public boolean isFNC1() {
        return this.value == '$';
    }
}
