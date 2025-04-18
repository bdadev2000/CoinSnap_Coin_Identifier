package okio;

import com.google.common.primitives.UnsignedBytes;
import e0.f;
import java.util.List;
import java.util.RandomAccess;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class Options extends f implements RandomAccess {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final ByteString[] byteStrings;

    @NotNull
    private final int[] trie;

    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private final void buildTrieRecursive(long j2, Buffer buffer, int i2, List<? extends ByteString> list, int i3, int i4, List<Integer> list2) {
            int i5;
            int i6;
            int i7;
            int i8;
            Buffer buffer2;
            int i9 = i2;
            if (i3 >= i4) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            for (int i10 = i3; i10 < i4; i10++) {
                if (list.get(i10).size() < i9) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            }
            ByteString byteString = list.get(i3);
            ByteString byteString2 = list.get(i4 - 1);
            int i11 = -1;
            if (i9 == byteString.size()) {
                int intValue = list2.get(i3).intValue();
                int i12 = i3 + 1;
                ByteString byteString3 = list.get(i12);
                i5 = i12;
                i6 = intValue;
                byteString = byteString3;
            } else {
                i5 = i3;
                i6 = -1;
            }
            if (byteString.getByte(i9) == byteString2.getByte(i9)) {
                int min = Math.min(byteString.size(), byteString2.size());
                int i13 = 0;
                for (int i14 = i9; i14 < min && byteString.getByte(i14) == byteString2.getByte(i14); i14++) {
                    i13++;
                }
                long intCount = j2 + getIntCount(buffer) + 2 + i13 + 1;
                buffer.writeInt(-i13);
                buffer.writeInt(i6);
                int i15 = i13 + i9;
                while (i9 < i15) {
                    buffer.writeInt(byteString.getByte(i9) & UnsignedBytes.MAX_VALUE);
                    i9++;
                }
                if (i5 + 1 == i4) {
                    if (i15 != list.get(i5).size()) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    buffer.writeInt(list2.get(i5).intValue());
                    return;
                } else {
                    Buffer buffer3 = new Buffer();
                    buffer.writeInt(((int) (getIntCount(buffer3) + intCount)) * (-1));
                    buildTrieRecursive(intCount, buffer3, i15, list, i5, i4, list2);
                    buffer.writeAll(buffer3);
                    return;
                }
            }
            int i16 = 1;
            for (int i17 = i5 + 1; i17 < i4; i17++) {
                if (list.get(i17 - 1).getByte(i9) != list.get(i17).getByte(i9)) {
                    i16++;
                }
            }
            long intCount2 = j2 + getIntCount(buffer) + 2 + (i16 * 2);
            buffer.writeInt(i16);
            buffer.writeInt(i6);
            for (int i18 = i5; i18 < i4; i18++) {
                byte b2 = list.get(i18).getByte(i9);
                if (i18 == i5 || b2 != list.get(i18 - 1).getByte(i9)) {
                    buffer.writeInt(b2 & UnsignedBytes.MAX_VALUE);
                }
            }
            Buffer buffer4 = new Buffer();
            while (i5 < i4) {
                byte b3 = list.get(i5).getByte(i9);
                int i19 = i5 + 1;
                int i20 = i19;
                while (true) {
                    if (i20 >= i4) {
                        i7 = i4;
                        break;
                    } else {
                        if (b3 != list.get(i20).getByte(i9)) {
                            i7 = i20;
                            break;
                        }
                        i20++;
                    }
                }
                if (i19 == i7 && i9 + 1 == list.get(i5).size()) {
                    buffer.writeInt(list2.get(i5).intValue());
                    i8 = i7;
                    buffer2 = buffer4;
                } else {
                    buffer.writeInt(((int) (intCount2 + getIntCount(buffer4))) * i11);
                    i8 = i7;
                    buffer2 = buffer4;
                    buildTrieRecursive(intCount2, buffer4, i9 + 1, list, i5, i7, list2);
                }
                buffer4 = buffer2;
                i5 = i8;
                i11 = -1;
            }
            buffer.writeAll(buffer4);
        }

        public static /* synthetic */ void buildTrieRecursive$default(Companion companion, long j2, Buffer buffer, int i2, List list, int i3, int i4, List list2, int i5, Object obj) {
            companion.buildTrieRecursive((i5 & 1) != 0 ? 0L : j2, buffer, (i5 & 4) != 0 ? 0 : i2, list, (i5 & 16) != 0 ? 0 : i3, (i5 & 32) != 0 ? list.size() : i4, list2);
        }

        private final long getIntCount(Buffer buffer) {
            return buffer.size() / 4;
        }

        /* JADX WARN: Code restructure failed: missing block: B:38:0x00be, code lost:
        
            continue;
         */
        @org.jetbrains.annotations.NotNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final okio.Options of(@org.jetbrains.annotations.NotNull okio.ByteString... r17) {
            /*
                Method dump skipped, instructions count: 263
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: okio.Options.Companion.of(okio.ByteString[]):okio.Options");
        }
    }

    public /* synthetic */ Options(ByteString[] byteStringArr, int[] iArr, k kVar) {
        this(byteStringArr, iArr);
    }

    @NotNull
    public static final Options of(@NotNull ByteString... byteStringArr) {
        return Companion.of(byteStringArr);
    }

    @Override // e0.a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof ByteString) {
            return contains((ByteString) obj);
        }
        return false;
    }

    @NotNull
    public final ByteString[] getByteStrings$okio() {
        return this.byteStrings;
    }

    @Override // e0.a
    public int getSize() {
        return this.byteStrings.length;
    }

    @NotNull
    public final int[] getTrie$okio() {
        return this.trie;
    }

    @Override // e0.f, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof ByteString) {
            return indexOf((ByteString) obj);
        }
        return -1;
    }

    @Override // e0.f, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof ByteString) {
            return lastIndexOf((ByteString) obj);
        }
        return -1;
    }

    private Options(ByteString[] byteStringArr, int[] iArr) {
        this.byteStrings = byteStringArr;
        this.trie = iArr;
    }

    public /* bridge */ boolean contains(ByteString byteString) {
        return super.contains((Object) byteString);
    }

    @Override // java.util.List
    @NotNull
    public ByteString get(int i2) {
        return this.byteStrings[i2];
    }

    public /* bridge */ int indexOf(ByteString byteString) {
        return super.indexOf((Object) byteString);
    }

    public /* bridge */ int lastIndexOf(ByteString byteString) {
        return super.lastIndexOf((Object) byteString);
    }
}
