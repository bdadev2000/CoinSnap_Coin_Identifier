package com.mbridge.msdk.thrid.okio;

import java.util.AbstractList;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class Options extends AbstractList<ByteString> implements RandomAccess {
    final ByteString[] byteStrings;
    final int[] trie;

    private Options(ByteString[] byteStringArr, int[] iArr) {
        this.byteStrings = byteStringArr;
        this.trie = iArr;
    }

    private static void buildTrieRecursive(long j7, Buffer buffer, int i9, List<ByteString> list, int i10, int i11, List<Integer> list2) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        Buffer buffer2;
        if (i10 < i11) {
            for (int i17 = i10; i17 < i11; i17++) {
                if (list.get(i17).size() < i9) {
                    throw new AssertionError();
                }
            }
            ByteString byteString = list.get(i10);
            ByteString byteString2 = list.get(i11 - 1);
            if (i9 == byteString.size()) {
                int i18 = i10 + 1;
                i13 = i18;
                i12 = list2.get(i10).intValue();
                byteString = list.get(i18);
            } else {
                i12 = -1;
                i13 = i10;
            }
            if (byteString.getByte(i9) != byteString2.getByte(i9)) {
                int i19 = 1;
                for (int i20 = i13 + 1; i20 < i11; i20++) {
                    if (list.get(i20 - 1).getByte(i9) != list.get(i20).getByte(i9)) {
                        i19++;
                    }
                }
                long intCount = j7 + intCount(buffer) + 2 + (i19 * 2);
                buffer.writeInt(i19);
                buffer.writeInt(i12);
                for (int i21 = i13; i21 < i11; i21++) {
                    byte b = list.get(i21).getByte(i9);
                    if (i21 == i13 || b != list.get(i21 - 1).getByte(i9)) {
                        buffer.writeInt(b & 255);
                    }
                }
                Buffer buffer3 = new Buffer();
                int i22 = i13;
                while (i22 < i11) {
                    byte b8 = list.get(i22).getByte(i9);
                    int i23 = i22 + 1;
                    int i24 = i23;
                    while (true) {
                        if (i24 < i11) {
                            if (b8 != list.get(i24).getByte(i9)) {
                                i15 = i24;
                                break;
                            }
                            i24++;
                        } else {
                            i15 = i11;
                            break;
                        }
                    }
                    if (i23 == i15 && i9 + 1 == list.get(i22).size()) {
                        buffer.writeInt(list2.get(i22).intValue());
                        i16 = i15;
                        buffer2 = buffer3;
                    } else {
                        buffer.writeInt((int) ((intCount(buffer3) + intCount) * (-1)));
                        i16 = i15;
                        buffer2 = buffer3;
                        buildTrieRecursive(intCount, buffer3, i9 + 1, list, i22, i15, list2);
                    }
                    buffer3 = buffer2;
                    i22 = i16;
                }
                Buffer buffer4 = buffer3;
                buffer.write(buffer4, buffer4.size());
                return;
            }
            int min = Math.min(byteString.size(), byteString2.size());
            int i25 = 0;
            for (int i26 = i9; i26 < min && byteString.getByte(i26) == byteString2.getByte(i26); i26++) {
                i25++;
            }
            long intCount2 = 1 + j7 + intCount(buffer) + 2 + i25;
            buffer.writeInt(-i25);
            buffer.writeInt(i12);
            int i27 = i9;
            while (true) {
                i14 = i9 + i25;
                if (i27 >= i14) {
                    break;
                }
                buffer.writeInt(byteString.getByte(i27) & 255);
                i27++;
            }
            if (i13 + 1 == i11) {
                if (i14 == list.get(i13).size()) {
                    buffer.writeInt(list2.get(i13).intValue());
                    return;
                }
                throw new AssertionError();
            }
            Buffer buffer5 = new Buffer();
            buffer.writeInt((int) ((intCount(buffer5) + intCount2) * (-1)));
            buildTrieRecursive(intCount2, buffer5, i14, list, i13, i11, list2);
            buffer.write(buffer5, buffer5.size());
            return;
        }
        throw new AssertionError();
    }

    private static int intCount(Buffer buffer) {
        return (int) (buffer.size() / 4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b7, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.mbridge.msdk.thrid.okio.Options of(com.mbridge.msdk.thrid.okio.ByteString... r11) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.thrid.okio.Options.of(com.mbridge.msdk.thrid.okio.ByteString[]):com.mbridge.msdk.thrid.okio.Options");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.byteStrings.length;
    }

    @Override // java.util.AbstractList, java.util.List
    public ByteString get(int i9) {
        return this.byteStrings[i9];
    }
}
