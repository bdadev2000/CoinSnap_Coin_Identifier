package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0005\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\u0010\n\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u000bH\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\fH\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lkotlinx/serialization/json/internal/ComposerForUnsignedNumbers;", "Lkotlinx/serialization/json/internal/Composer;", "writer", "Lkotlinx/serialization/json/internal/JsonWriter;", "forceQuoting", "", "(Lkotlinx/serialization/json/internal/JsonWriter;Z)V", "print", "", "v", "", "", "", "", "kotlinx-serialization-json"}, k = 1, mv = {1, 7, 1}, xi = 48)
@SuppressAnimalSniffer
/* loaded from: classes5.dex */
public final class ComposerForUnsignedNumbers extends Composer {
    private final boolean forceQuoting;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposerForUnsignedNumbers(JsonWriter writer, boolean z10) {
        super(writer);
        Intrinsics.checkNotNullParameter(writer, "writer");
        this.forceQuoting = z10;
    }

    @Override // kotlinx.serialization.json.internal.Composer
    public void print(int v10) {
        boolean z10 = this.forceQuoting;
        String l10 = Long.toString(4294967295L & UInt.m240constructorimpl(v10), 10);
        if (z10) {
            printQuoted(l10);
        } else {
            print(l10);
        }
    }

    @Override // kotlinx.serialization.json.internal.Composer
    public void print(long v10) {
        boolean z10 = this.forceQuoting;
        int i10 = 63;
        String str = "0";
        long m319constructorimpl = ULong.m319constructorimpl(v10);
        if (z10) {
            if (m319constructorimpl != 0) {
                if (m319constructorimpl > 0) {
                    str = Long.toString(m319constructorimpl, 10);
                } else {
                    char[] cArr = new char[64];
                    long j3 = (m319constructorimpl >>> 1) / 5;
                    long j10 = 10;
                    cArr[63] = Character.forDigit((int) (m319constructorimpl - (j3 * j10)), 10);
                    while (j3 > 0) {
                        i10--;
                        cArr[i10] = Character.forDigit((int) (j3 % j10), 10);
                        j3 /= j10;
                    }
                    str = new String(cArr, i10, 64 - i10);
                }
            }
            printQuoted(str);
            return;
        }
        if (m319constructorimpl != 0) {
            if (m319constructorimpl > 0) {
                str = Long.toString(m319constructorimpl, 10);
            } else {
                char[] cArr2 = new char[64];
                long j11 = (m319constructorimpl >>> 1) / 5;
                long j12 = 10;
                cArr2[63] = Character.forDigit((int) (m319constructorimpl - (j11 * j12)), 10);
                while (j11 > 0) {
                    i10--;
                    cArr2[i10] = Character.forDigit((int) (j11 % j12), 10);
                    j11 /= j12;
                }
                str = new String(cArr2, i10, 64 - i10);
            }
        }
        print(str);
    }

    @Override // kotlinx.serialization.json.internal.Composer
    public void print(byte v10) {
        boolean z10 = this.forceQuoting;
        String m207toStringimpl = UByte.m207toStringimpl(UByte.m163constructorimpl(v10));
        if (z10) {
            printQuoted(m207toStringimpl);
        } else {
            print(m207toStringimpl);
        }
    }

    @Override // kotlinx.serialization.json.internal.Composer
    public void print(short v10) {
        boolean z10 = this.forceQuoting;
        String m470toStringimpl = UShort.m470toStringimpl(UShort.m426constructorimpl(v10));
        if (z10) {
            printQuoted(m470toStringimpl);
        } else {
            print(m470toStringimpl);
        }
    }
}
