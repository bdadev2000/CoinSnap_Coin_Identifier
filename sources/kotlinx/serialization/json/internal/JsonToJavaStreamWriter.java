package kotlinx.serialization.json.internal;

import a4.j;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.OutputStream;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0011\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\nH\u0082\bJ\u0018\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\nH\u0002J\b\u0010\u0015\u001a\u00020\fH\u0002J\b\u0010\u0016\u001a\u00020\fH\u0016J\t\u0010\u0017\u001a\u00020\nH\u0082\bJ\u0011\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\nH\u0082\bJ\u0010\u0010\u0018\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u000fH\u0016J\u0010\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0010\u0010!\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u000fH\u0016J\u0018\u0010\"\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010#\u001a\u00020\nH\u0002J\u0010\u0010$\u001a\u00020\f2\u0006\u0010%\u001a\u00020\nH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lkotlinx/serialization/json/internal/JsonToJavaStreamWriter;", "Lkotlinx/serialization/json/internal/JsonWriter;", "stream", "Ljava/io/OutputStream;", "(Ljava/io/OutputStream;)V", "buffer", "", "charArray", "", "indexInBuffer", "", "appendStringSlowPath", "", "currentSize", "string", "", "ensure", "bytesCount", "ensureTotalCapacity", "oldSize", "additional", "flush", "release", "rest", "write", "byte", MimeTypes.BASE_TYPE_TEXT, "writeChar", "char", "", "writeLong", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "writeQuoted", "writeUtf8", "count", "writeUtf8CodePoint", "codePoint", "kotlinx-serialization-json"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes5.dex */
public final class JsonToJavaStreamWriter implements JsonWriter {
    private final byte[] buffer;
    private char[] charArray;
    private int indexInBuffer;
    private final OutputStream stream;

    public JsonToJavaStreamWriter(OutputStream stream) {
        Intrinsics.checkNotNullParameter(stream, "stream");
        this.stream = stream;
        this.buffer = ByteArrayPool.INSTANCE.take();
        this.charArray = CharArrayPool.INSTANCE.take();
    }

    private final void appendStringSlowPath(int currentSize, String string) {
        int i10;
        int length = string.length();
        for (int i11 = currentSize - 1; i11 < length; i11++) {
            int ensureTotalCapacity = ensureTotalCapacity(currentSize, 2);
            char charAt = string.charAt(i11);
            if (charAt < StringOpsKt.getESCAPE_MARKERS().length) {
                byte b3 = StringOpsKt.getESCAPE_MARKERS()[charAt];
                if (b3 == 0) {
                    i10 = ensureTotalCapacity + 1;
                    this.charArray[ensureTotalCapacity] = charAt;
                } else {
                    if (b3 == 1) {
                        String str = StringOpsKt.getESCAPE_STRINGS()[charAt];
                        Intrinsics.checkNotNull(str);
                        int ensureTotalCapacity2 = ensureTotalCapacity(ensureTotalCapacity, str.length());
                        str.getChars(0, str.length(), this.charArray, ensureTotalCapacity2);
                        currentSize = str.length() + ensureTotalCapacity2;
                    } else {
                        char[] cArr = this.charArray;
                        cArr[ensureTotalCapacity] = AbstractJsonLexerKt.STRING_ESC;
                        cArr[ensureTotalCapacity + 1] = (char) b3;
                        currentSize = ensureTotalCapacity + 2;
                    }
                }
            } else {
                i10 = ensureTotalCapacity + 1;
                this.charArray[ensureTotalCapacity] = charAt;
            }
            currentSize = i10;
        }
        ensureTotalCapacity(currentSize, 1);
        char[] cArr2 = this.charArray;
        cArr2[currentSize] = '\"';
        writeUtf8(cArr2, currentSize + 1);
        flush();
    }

    private final void ensure(int bytesCount) {
        if (this.buffer.length - this.indexInBuffer < bytesCount) {
            flush();
        }
    }

    private final int ensureTotalCapacity(int oldSize, int additional) {
        int i10 = additional + oldSize;
        char[] cArr = this.charArray;
        if (cArr.length <= i10) {
            char[] copyOf = Arrays.copyOf(cArr, RangesKt.coerceAtLeast(i10, oldSize * 2));
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.charArray = copyOf;
        }
        return oldSize;
    }

    private final void flush() {
        this.stream.write(this.buffer, 0, this.indexInBuffer);
        this.indexInBuffer = 0;
    }

    private final int rest() {
        return this.buffer.length - this.indexInBuffer;
    }

    private final void writeUtf8(char[] string, int count) {
        boolean z10;
        boolean z11;
        char c10;
        boolean z12;
        if (count >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (count <= string.length) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                int i10 = 0;
                while (i10 < count) {
                    char c11 = string[i10];
                    if (c11 < 128) {
                        if (this.buffer.length - this.indexInBuffer < 1) {
                            flush();
                        }
                        byte[] bArr = this.buffer;
                        int i11 = this.indexInBuffer;
                        int i12 = i11 + 1;
                        this.indexInBuffer = i12;
                        bArr[i11] = (byte) c11;
                        i10++;
                        int min = Math.min(count, (bArr.length - i12) + i10);
                        while (i10 < min) {
                            char c12 = string[i10];
                            if (c12 < 128) {
                                byte[] bArr2 = this.buffer;
                                int i13 = this.indexInBuffer;
                                this.indexInBuffer = i13 + 1;
                                bArr2[i13] = (byte) c12;
                                i10++;
                            }
                        }
                    } else {
                        if (c11 < 2048) {
                            if (this.buffer.length - this.indexInBuffer < 2) {
                                flush();
                            }
                            int i14 = (c11 >> 6) | PsExtractor.AUDIO_STREAM;
                            byte[] bArr3 = this.buffer;
                            int i15 = this.indexInBuffer;
                            int i16 = i15 + 1;
                            bArr3[i15] = (byte) i14;
                            this.indexInBuffer = i16 + 1;
                            bArr3[i16] = (byte) ((c11 & '?') | 128);
                        } else if (c11 >= 55296 && c11 <= 57343) {
                            int i17 = i10 + 1;
                            if (i17 < count) {
                                c10 = string[i17];
                            } else {
                                c10 = 0;
                            }
                            if (c11 <= 56319) {
                                if (56320 <= c10 && c10 < 57344) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if (z12) {
                                    int i18 = (((c11 & 1023) << 10) | (c10 & 1023)) + C.DEFAULT_BUFFER_SEGMENT_SIZE;
                                    if (this.buffer.length - this.indexInBuffer < 4) {
                                        flush();
                                    }
                                    int i19 = (i18 >> 18) | PsExtractor.VIDEO_STREAM_MASK;
                                    byte[] bArr4 = this.buffer;
                                    int i20 = this.indexInBuffer;
                                    int i21 = i20 + 1;
                                    bArr4[i20] = (byte) i19;
                                    int i22 = i21 + 1;
                                    bArr4[i21] = (byte) (((i18 >> 12) & 63) | 128);
                                    int i23 = i22 + 1;
                                    bArr4[i22] = (byte) (((i18 >> 6) & 63) | 128);
                                    this.indexInBuffer = i23 + 1;
                                    bArr4[i23] = (byte) ((i18 & 63) | 128);
                                    i10 += 2;
                                }
                            }
                            if (this.buffer.length - this.indexInBuffer < 1) {
                                flush();
                            }
                            byte[] bArr5 = this.buffer;
                            int i24 = this.indexInBuffer;
                            this.indexInBuffer = i24 + 1;
                            bArr5[i24] = (byte) 63;
                            i10 = i17;
                        } else {
                            if (this.buffer.length - this.indexInBuffer < 3) {
                                flush();
                            }
                            byte[] bArr6 = this.buffer;
                            int i25 = this.indexInBuffer;
                            int i26 = i25 + 1;
                            bArr6[i25] = (byte) ((c11 >> '\f') | 224);
                            int i27 = i26 + 1;
                            bArr6[i26] = (byte) (((c11 >> 6) & 63) | 128);
                            this.indexInBuffer = i27 + 1;
                            bArr6[i27] = (byte) ((c11 & '?') | 128);
                        }
                        i10++;
                    }
                }
                return;
            }
            StringBuilder m10 = j.m("count > string.length: ", count, " > ");
            m10.append(string.length);
            throw new IllegalArgumentException(m10.toString().toString());
        }
        throw new IllegalArgumentException("count < 0".toString());
    }

    private final void writeUtf8CodePoint(int codePoint) {
        if (codePoint < 128) {
            if (this.buffer.length - this.indexInBuffer < 1) {
                flush();
            }
            byte[] bArr = this.buffer;
            int i10 = this.indexInBuffer;
            this.indexInBuffer = i10 + 1;
            bArr[i10] = (byte) codePoint;
            return;
        }
        if (codePoint < 2048) {
            if (this.buffer.length - this.indexInBuffer < 2) {
                flush();
            }
            int i11 = (codePoint >> 6) | PsExtractor.AUDIO_STREAM;
            byte[] bArr2 = this.buffer;
            int i12 = this.indexInBuffer;
            int i13 = i12 + 1;
            bArr2[i12] = (byte) i11;
            this.indexInBuffer = i13 + 1;
            bArr2[i13] = (byte) ((codePoint & 63) | 128);
            return;
        }
        boolean z10 = false;
        if (55296 <= codePoint && codePoint < 57344) {
            z10 = true;
        }
        if (z10) {
            if (this.buffer.length - this.indexInBuffer < 1) {
                flush();
            }
            byte[] bArr3 = this.buffer;
            int i14 = this.indexInBuffer;
            this.indexInBuffer = i14 + 1;
            bArr3[i14] = (byte) 63;
            return;
        }
        if (codePoint < 65536) {
            if (this.buffer.length - this.indexInBuffer < 3) {
                flush();
            }
            byte[] bArr4 = this.buffer;
            int i15 = this.indexInBuffer;
            int i16 = i15 + 1;
            bArr4[i15] = (byte) ((codePoint >> 12) | 224);
            int i17 = i16 + 1;
            bArr4[i16] = (byte) (((codePoint >> 6) & 63) | 128);
            this.indexInBuffer = i17 + 1;
            bArr4[i17] = (byte) ((codePoint & 63) | 128);
            return;
        }
        if (codePoint <= 1114111) {
            if (this.buffer.length - this.indexInBuffer < 4) {
                flush();
            }
            int i18 = (codePoint >> 18) | PsExtractor.VIDEO_STREAM_MASK;
            byte[] bArr5 = this.buffer;
            int i19 = this.indexInBuffer;
            int i20 = i19 + 1;
            bArr5[i19] = (byte) i18;
            int i21 = i20 + 1;
            bArr5[i20] = (byte) (((codePoint >> 12) & 63) | 128);
            int i22 = i21 + 1;
            bArr5[i21] = (byte) (((codePoint >> 6) & 63) | 128);
            this.indexInBuffer = i22 + 1;
            bArr5[i22] = (byte) ((codePoint & 63) | 128);
            return;
        }
        throw new JsonEncodingException(eb.j.i("Unexpected code point: ", codePoint));
    }

    @Override // kotlinx.serialization.json.internal.JsonWriter
    public void release() {
        flush();
        CharArrayPool.INSTANCE.release(this.charArray);
        ByteArrayPool.INSTANCE.release(this.buffer);
    }

    @Override // kotlinx.serialization.json.internal.JsonWriter
    public void write(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        int length = text.length();
        ensureTotalCapacity(0, length);
        text.getChars(0, length, this.charArray, 0);
        writeUtf8(this.charArray, length);
    }

    @Override // kotlinx.serialization.json.internal.JsonWriter
    public void writeChar(char r12) {
        writeUtf8CodePoint(r12);
    }

    @Override // kotlinx.serialization.json.internal.JsonWriter
    public void writeLong(long value) {
        write(String.valueOf(value));
    }

    @Override // kotlinx.serialization.json.internal.JsonWriter
    public void writeQuoted(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        ensureTotalCapacity(0, text.length() + 2);
        char[] cArr = this.charArray;
        cArr[0] = '\"';
        int length = text.length();
        text.getChars(0, length, cArr, 1);
        int i10 = length + 1;
        for (int i11 = 1; i11 < i10; i11++) {
            char c10 = cArr[i11];
            if (c10 < StringOpsKt.getESCAPE_MARKERS().length && StringOpsKt.getESCAPE_MARKERS()[c10] != 0) {
                appendStringSlowPath(i11, text);
                return;
            }
        }
        cArr[i10] = '\"';
        writeUtf8(cArr, length + 2);
        flush();
    }

    private final void write(int r42) {
        byte[] bArr = this.buffer;
        int i10 = this.indexInBuffer;
        this.indexInBuffer = i10 + 1;
        bArr[i10] = (byte) r42;
    }
}
