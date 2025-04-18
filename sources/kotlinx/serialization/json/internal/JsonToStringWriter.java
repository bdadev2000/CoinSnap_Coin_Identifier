package kotlinx.serialization.json.internal;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0006H\u0002J\u0018\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0006H\u0002J\b\u0010\u0012\u001a\u00020\bH\u0016J\b\u0010\u0013\u001a\u00020\fH\u0016J\u0010\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\fH\u0016J\u0010\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lkotlinx/serialization/json/internal/JsonToStringWriter;", "Lkotlinx/serialization/json/internal/JsonWriter;", "()V", "array", "", "size", "", "appendStringSlowPath", "", "firstEscapedChar", "currentSize", "string", "", "ensureAdditionalCapacity", "expected", "ensureTotalCapacity", "oldSize", "additional", "release", "toString", "write", MimeTypes.BASE_TYPE_TEXT, "writeChar", "char", "", "writeLong", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "writeQuoted", "kotlinx-serialization-json"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes5.dex */
public final class JsonToStringWriter implements JsonWriter {
    private char[] array = CharArrayPool.INSTANCE.take();
    private int size;

    private final void appendStringSlowPath(int firstEscapedChar, int currentSize, String string) {
        int i10;
        int length = string.length();
        while (firstEscapedChar < length) {
            int ensureTotalCapacity = ensureTotalCapacity(currentSize, 2);
            char charAt = string.charAt(firstEscapedChar);
            if (charAt < StringOpsKt.getESCAPE_MARKERS().length) {
                byte b3 = StringOpsKt.getESCAPE_MARKERS()[charAt];
                if (b3 == 0) {
                    i10 = ensureTotalCapacity + 1;
                    this.array[ensureTotalCapacity] = charAt;
                } else {
                    if (b3 == 1) {
                        String str = StringOpsKt.getESCAPE_STRINGS()[charAt];
                        Intrinsics.checkNotNull(str);
                        int ensureTotalCapacity2 = ensureTotalCapacity(ensureTotalCapacity, str.length());
                        str.getChars(0, str.length(), this.array, ensureTotalCapacity2);
                        int length2 = str.length() + ensureTotalCapacity2;
                        this.size = length2;
                        currentSize = length2;
                    } else {
                        char[] cArr = this.array;
                        cArr[ensureTotalCapacity] = AbstractJsonLexerKt.STRING_ESC;
                        cArr[ensureTotalCapacity + 1] = (char) b3;
                        currentSize = ensureTotalCapacity + 2;
                        this.size = currentSize;
                    }
                    firstEscapedChar++;
                }
            } else {
                i10 = ensureTotalCapacity + 1;
                this.array[ensureTotalCapacity] = charAt;
            }
            currentSize = i10;
            firstEscapedChar++;
        }
        int ensureTotalCapacity3 = ensureTotalCapacity(currentSize, 1);
        this.array[ensureTotalCapacity3] = '\"';
        this.size = ensureTotalCapacity3 + 1;
    }

    private final void ensureAdditionalCapacity(int expected) {
        ensureTotalCapacity(this.size, expected);
    }

    private final int ensureTotalCapacity(int oldSize, int additional) {
        int i10 = additional + oldSize;
        char[] cArr = this.array;
        if (cArr.length <= i10) {
            char[] copyOf = Arrays.copyOf(cArr, RangesKt.coerceAtLeast(i10, oldSize * 2));
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.array = copyOf;
        }
        return oldSize;
    }

    @Override // kotlinx.serialization.json.internal.JsonWriter
    public void release() {
        CharArrayPool.INSTANCE.release(this.array);
    }

    public String toString() {
        return new String(this.array, 0, this.size);
    }

    @Override // kotlinx.serialization.json.internal.JsonWriter
    public void write(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        int length = text.length();
        if (length == 0) {
            return;
        }
        ensureAdditionalCapacity(length);
        text.getChars(0, text.length(), this.array, this.size);
        this.size += length;
    }

    @Override // kotlinx.serialization.json.internal.JsonWriter
    public void writeChar(char r42) {
        ensureAdditionalCapacity(1);
        char[] cArr = this.array;
        int i10 = this.size;
        this.size = i10 + 1;
        cArr[i10] = r42;
    }

    @Override // kotlinx.serialization.json.internal.JsonWriter
    public void writeLong(long value) {
        write(String.valueOf(value));
    }

    @Override // kotlinx.serialization.json.internal.JsonWriter
    public void writeQuoted(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        ensureAdditionalCapacity(text.length() + 2);
        char[] cArr = this.array;
        int i10 = this.size;
        int i11 = i10 + 1;
        cArr[i10] = '\"';
        int length = text.length();
        text.getChars(0, length, cArr, i11);
        int i12 = length + i11;
        for (int i13 = i11; i13 < i12; i13++) {
            char c10 = cArr[i13];
            if (c10 < StringOpsKt.getESCAPE_MARKERS().length && StringOpsKt.getESCAPE_MARKERS()[c10] != 0) {
                appendStringSlowPath(i13 - i11, i13, text);
                return;
            }
        }
        cArr[i12] = '\"';
        this.size = i12 + 1;
    }
}
