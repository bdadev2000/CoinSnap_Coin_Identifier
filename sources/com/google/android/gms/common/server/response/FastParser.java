package com.google.android.gms.common.server.response;

import a4.j;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.util.JsonUtils;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Map;
import java.util.Stack;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.a;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

@ShowFirstParty
@KeepForSdk
/* loaded from: classes3.dex */
public class FastParser<T extends FastJsonResponse> {
    private static final char[] zaa = {AbstractJsonLexerKt.UNICODE_ESC, 'l', 'l'};
    private static final char[] zab = {'r', AbstractJsonLexerKt.UNICODE_ESC, 'e'};
    private static final char[] zac = {'r', AbstractJsonLexerKt.UNICODE_ESC, 'e', '\"'};
    private static final char[] zad = {'a', 'l', 's', 'e'};
    private static final char[] zae = {'a', 'l', 's', 'e', '\"'};
    private static final char[] zaf = {'\n'};
    private static final zai zag = new zaa();
    private static final zai zah = new zab();
    private static final zai zai = new zac();
    private static final zai zaj = new zad();
    private static final zai zak = new zae();
    private static final zai zal = new zaf();
    private static final zai zam = new zag();
    private static final zai zan = new zah();
    private final char[] zao = new char[1];
    private final char[] zap = new char[32];
    private final char[] zaq = new char[LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY];
    private final StringBuilder zar = new StringBuilder(32);
    private final StringBuilder zas = new StringBuilder(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
    private final Stack zat = new Stack();

    @ShowFirstParty
    @KeepForSdk
    /* loaded from: classes3.dex */
    public static class ParseException extends Exception {
        public ParseException(@NonNull String str) {
            super(str);
        }

        public ParseException(@NonNull String str, @NonNull Throwable th2) {
            super("Error instantiating inner object", th2);
        }

        public ParseException(@NonNull Throwable th2) {
            super(th2);
        }
    }

    private static final String zaA(BufferedReader bufferedReader, char[] cArr, StringBuilder sb2, @Nullable char[] cArr2) throws ParseException, IOException {
        sb2.setLength(0);
        bufferedReader.mark(cArr.length);
        boolean z10 = false;
        boolean z11 = false;
        loop0: while (true) {
            int read = bufferedReader.read(cArr);
            if (read != -1) {
                int i10 = 0;
                while (i10 < read) {
                    char c10 = cArr[i10];
                    if (!Character.isISOControl(c10) || (cArr2 != null && cArr2[0] == c10)) {
                        int i11 = i10 + 1;
                        if (c10 == '\"') {
                            if (!z10) {
                                sb2.append(cArr, 0, i10);
                                bufferedReader.reset();
                                bufferedReader.skip(i11);
                                if (z11) {
                                    return JsonUtils.unescapeString(sb2.toString());
                                }
                                return sb2.toString();
                            }
                        } else if (c10 == '\\') {
                            z10 = !z10;
                            z11 = true;
                            i10 = i11;
                        }
                        z10 = false;
                        i10 = i11;
                    }
                }
                sb2.append(cArr, 0, read);
                bufferedReader.mark(cArr.length);
            } else {
                throw new ParseException("Unexpected EOF while parsing string");
            }
        }
        throw new ParseException("Unexpected control character while reading string");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        return r3.zao[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0022, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x0008, code lost:
    
        if (r4.read(r3.zao) != (-1)) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (java.lang.Character.isWhitespace(r3.zao[0]) == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001a, code lost:
    
        if (r4.read(r3.zao) != (-1)) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final char zai(java.io.BufferedReader r4) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
        /*
            r3 = this;
            char[] r0 = r3.zao
            int r0 = r4.read(r0)
            r1 = 0
            r2 = -1
            if (r0 == r2) goto L22
        La:
            char[] r0 = r3.zao
            char r0 = r0[r1]
            boolean r0 = java.lang.Character.isWhitespace(r0)
            if (r0 == 0) goto L1d
            char[] r0 = r3.zao
            int r0 = r4.read(r0)
            if (r0 != r2) goto La
            goto L22
        L1d:
            char[] r4 = r3.zao
            char r4 = r4[r1]
            return r4
        L22:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.server.response.FastParser.zai(java.io.BufferedReader):char");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final double zaj(BufferedReader bufferedReader) throws ParseException, IOException {
        int zam2 = zam(bufferedReader, this.zaq);
        if (zam2 == 0) {
            return 0.0d;
        }
        return Double.parseDouble(new String(this.zaq, 0, zam2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float zak(BufferedReader bufferedReader) throws ParseException, IOException {
        int zam2 = zam(bufferedReader, this.zaq);
        if (zam2 == 0) {
            return 0.0f;
        }
        return Float.parseFloat(new String(this.zaq, 0, zam2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int zal(BufferedReader bufferedReader) throws ParseException, IOException {
        int i10;
        int i11;
        int i12;
        int i13;
        int zam2 = zam(bufferedReader, this.zaq);
        if (zam2 == 0) {
            return 0;
        }
        char[] cArr = this.zaq;
        if (zam2 > 0) {
            char c10 = cArr[0];
            if (c10 == '-') {
                i10 = Integer.MIN_VALUE;
            } else {
                i10 = -2147483647;
            }
            if (c10 == '-') {
                i11 = 1;
            } else {
                i11 = 0;
            }
            if (i11 < zam2) {
                i13 = i11 + 1;
                int digit = Character.digit(cArr[i11], 10);
                if (digit >= 0) {
                    i12 = -digit;
                } else {
                    throw new ParseException("Unexpected non-digit character");
                }
            } else {
                i12 = 0;
                i13 = i11;
            }
            while (i13 < zam2) {
                int i14 = i13 + 1;
                int digit2 = Character.digit(cArr[i13], 10);
                if (digit2 >= 0) {
                    if (i12 >= -214748364) {
                        int i15 = i12 * 10;
                        if (i15 >= i10 + digit2) {
                            i12 = i15 - digit2;
                            i13 = i14;
                        } else {
                            throw new ParseException("Number too large");
                        }
                    } else {
                        throw new ParseException("Number too large");
                    }
                } else {
                    throw new ParseException("Unexpected non-digit character");
                }
            }
            if (i11 != 0) {
                if (i13 <= 1) {
                    throw new ParseException("No digits to parse");
                }
                return i12;
            }
            return -i12;
        }
        throw new ParseException("No number to parse");
    }

    @ResultIgnorabilityUnspecified
    private final int zam(BufferedReader bufferedReader, char[] cArr) throws ParseException, IOException {
        int i10;
        char zai2 = zai(bufferedReader);
        if (zai2 != 0) {
            if (zai2 != ',') {
                if (zai2 == 'n') {
                    zax(bufferedReader, zaa);
                    return 0;
                }
                bufferedReader.mark(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
                if (zai2 == '\"') {
                    i10 = 0;
                    boolean z10 = false;
                    while (i10 < 1024 && bufferedReader.read(cArr, i10, 1) != -1) {
                        char c10 = cArr[i10];
                        if (!Character.isISOControl(c10)) {
                            int i11 = i10 + 1;
                            if (c10 == '\"') {
                                if (!z10) {
                                    bufferedReader.reset();
                                    bufferedReader.skip(i11);
                                    return i10;
                                }
                            } else if (c10 == '\\') {
                                z10 = !z10;
                                i10 = i11;
                            }
                            z10 = false;
                            i10 = i11;
                        } else {
                            throw new ParseException("Unexpected control character while reading string");
                        }
                    }
                } else {
                    cArr[0] = zai2;
                    i10 = 1;
                    while (i10 < 1024 && bufferedReader.read(cArr, i10, 1) != -1) {
                        char c11 = cArr[i10];
                        if (c11 != '}' && c11 != ',' && !Character.isWhitespace(c11) && cArr[i10] != ']') {
                            i10++;
                        } else {
                            bufferedReader.reset();
                            bufferedReader.skip(i10 - 1);
                            cArr[i10] = 0;
                            return i10;
                        }
                    }
                }
                if (i10 == 1024) {
                    throw new ParseException("Absurdly long value");
                }
                throw new ParseException("Unexpected EOF");
            }
            throw new ParseException("Missing value");
        }
        throw new ParseException("Unexpected EOF");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long zan(BufferedReader bufferedReader) throws ParseException, IOException {
        long j3;
        long j10;
        int i10;
        int zam2 = zam(bufferedReader, this.zaq);
        if (zam2 == 0) {
            return 0L;
        }
        char[] cArr = this.zaq;
        if (zam2 > 0) {
            int i11 = 0;
            char c10 = cArr[0];
            if (c10 == '-') {
                j3 = Long.MIN_VALUE;
            } else {
                j3 = C.TIME_UNSET;
            }
            if (c10 == '-') {
                i11 = 1;
            }
            if (i11 < zam2) {
                i10 = i11 + 1;
                int digit = Character.digit(cArr[i11], 10);
                if (digit >= 0) {
                    j10 = -digit;
                } else {
                    throw new ParseException("Unexpected non-digit character");
                }
            } else {
                j10 = 0;
                i10 = i11;
            }
            while (i10 < zam2) {
                int i12 = i10 + 1;
                int digit2 = Character.digit(cArr[i10], 10);
                if (digit2 >= 0) {
                    if (j10 >= -922337203685477580L) {
                        long j11 = j10 * 10;
                        int i13 = zam2;
                        long j12 = digit2;
                        if (j11 >= j3 + j12) {
                            j10 = j11 - j12;
                            zam2 = i13;
                            i10 = i12;
                        } else {
                            throw new ParseException("Number too large");
                        }
                    } else {
                        throw new ParseException("Number too large");
                    }
                } else {
                    throw new ParseException("Unexpected non-digit character");
                }
            }
            if (i11 != 0) {
                if (i10 <= 1) {
                    throw new ParseException("No digits to parse");
                }
                return j10;
            }
            return -j10;
        }
        throw new ParseException("No number to parse");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    public final String zao(BufferedReader bufferedReader) throws ParseException, IOException {
        return zap(bufferedReader, this.zap, this.zar, null);
    }

    @Nullable
    private final String zap(BufferedReader bufferedReader, char[] cArr, StringBuilder sb2, @Nullable char[] cArr2) throws ParseException, IOException {
        char zai2 = zai(bufferedReader);
        if (zai2 != '\"') {
            if (zai2 == 'n') {
                zax(bufferedReader, zaa);
                return null;
            }
            throw new ParseException("Expected string");
        }
        return zaA(bufferedReader, cArr, sb2, cArr2);
    }

    @Nullable
    @ResultIgnorabilityUnspecified
    private final String zaq(BufferedReader bufferedReader) throws ParseException, IOException {
        this.zat.push(2);
        char zai2 = zai(bufferedReader);
        if (zai2 != '\"') {
            if (zai2 != ']') {
                if (zai2 == '}') {
                    zaw(2);
                    return null;
                }
                throw new ParseException("Unexpected token: " + zai2);
            }
            zaw(2);
            zaw(1);
            zaw(5);
            return null;
        }
        this.zat.push(3);
        String zaA = zaA(bufferedReader, this.zap, this.zar, null);
        zaw(3);
        if (zai(bufferedReader) == ':') {
            return zaA;
        }
        throw new ParseException("Expected key/value separator");
    }

    @Nullable
    private final String zar(BufferedReader bufferedReader) throws ParseException, IOException {
        bufferedReader.mark(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
        char zai2 = zai(bufferedReader);
        int i10 = 1;
        if (zai2 != '\"') {
            if (zai2 != ',') {
                if (zai2 != '[') {
                    if (zai2 != '{') {
                        bufferedReader.reset();
                        zam(bufferedReader, this.zaq);
                    } else {
                        this.zat.push(1);
                        bufferedReader.mark(32);
                        char zai3 = zai(bufferedReader);
                        if (zai3 == '}') {
                            zaw(1);
                        } else if (zai3 == '\"') {
                            bufferedReader.reset();
                            zaq(bufferedReader);
                            do {
                            } while (zar(bufferedReader) != null);
                            zaw(1);
                        } else {
                            throw new ParseException("Unexpected token " + zai3);
                        }
                    }
                } else {
                    this.zat.push(5);
                    bufferedReader.mark(32);
                    if (zai(bufferedReader) == ']') {
                        zaw(5);
                    } else {
                        bufferedReader.reset();
                        boolean z10 = false;
                        boolean z11 = false;
                        while (i10 > 0) {
                            char zai4 = zai(bufferedReader);
                            if (zai4 != 0) {
                                if (!Character.isISOControl(zai4)) {
                                    if (zai4 == '\"') {
                                        if (!z11) {
                                            z10 = !z10;
                                        }
                                        zai4 = '\"';
                                    }
                                    if (zai4 == '[') {
                                        if (!z10) {
                                            i10++;
                                        }
                                        zai4 = '[';
                                    }
                                    if (zai4 == ']' && !z10) {
                                        i10--;
                                    }
                                    if (zai4 == '\\' && z10) {
                                        z11 = !z11;
                                    } else {
                                        z11 = false;
                                    }
                                } else {
                                    throw new ParseException("Unexpected control character while reading array");
                                }
                            } else {
                                throw new ParseException("Unexpected EOF while parsing array");
                            }
                        }
                        zaw(5);
                    }
                }
            } else {
                throw new ParseException("Missing value");
            }
        } else {
            if (bufferedReader.read(this.zao) != -1) {
                char c10 = this.zao[0];
                boolean z12 = false;
                do {
                    if (c10 == '\"') {
                        if (z12) {
                            c10 = '\"';
                            z12 = true;
                        }
                    }
                    if (c10 == '\\') {
                        z12 = !z12;
                    } else {
                        z12 = false;
                    }
                    if (bufferedReader.read(this.zao) != -1) {
                        c10 = this.zao[0];
                    } else {
                        throw new ParseException("Unexpected EOF while parsing string");
                    }
                } while (!Character.isISOControl(c10));
                throw new ParseException("Unexpected control character while reading string");
            }
            throw new ParseException("Unexpected EOF while parsing string");
        }
        char zai5 = zai(bufferedReader);
        if (zai5 != ',') {
            if (zai5 == '}') {
                zaw(2);
                return null;
            }
            throw new ParseException("Unexpected token " + zai5);
        }
        zaw(2);
        return zaq(bufferedReader);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    public final BigDecimal zas(BufferedReader bufferedReader) throws ParseException, IOException {
        int zam2 = zam(bufferedReader, this.zaq);
        if (zam2 == 0) {
            return null;
        }
        return new BigDecimal(new String(this.zaq, 0, zam2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    public final BigInteger zat(BufferedReader bufferedReader) throws ParseException, IOException {
        int zam2 = zam(bufferedReader, this.zaq);
        if (zam2 == 0) {
            return null;
        }
        return new BigInteger(new String(this.zaq, 0, zam2));
    }

    @Nullable
    private final ArrayList zau(BufferedReader bufferedReader, zai zaiVar) throws ParseException, IOException {
        char zai2 = zai(bufferedReader);
        if (zai2 == 'n') {
            zax(bufferedReader, zaa);
            return null;
        }
        if (zai2 == '[') {
            this.zat.push(5);
            ArrayList arrayList = new ArrayList();
            while (true) {
                bufferedReader.mark(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
                char zai3 = zai(bufferedReader);
                if (zai3 != 0) {
                    if (zai3 != ',') {
                        if (zai3 != ']') {
                            bufferedReader.reset();
                            arrayList.add(zaiVar.zaa(this, bufferedReader));
                        } else {
                            zaw(5);
                            return arrayList;
                        }
                    }
                } else {
                    throw new ParseException("Unexpected EOF");
                }
            }
        } else {
            throw new ParseException("Expected start of array");
        }
    }

    @Nullable
    private final ArrayList zav(BufferedReader bufferedReader, FastJsonResponse.Field field) throws ParseException, IOException {
        ArrayList arrayList = new ArrayList();
        char zai2 = zai(bufferedReader);
        if (zai2 != ']') {
            if (zai2 != 'n') {
                if (zai2 == '{') {
                    this.zat.push(1);
                    while (true) {
                        try {
                            FastJsonResponse zad2 = field.zad();
                            if (zaz(bufferedReader, zad2)) {
                                arrayList.add(zad2);
                                char zai3 = zai(bufferedReader);
                                if (zai3 != ',') {
                                    if (zai3 == ']') {
                                        zaw(5);
                                        return arrayList;
                                    }
                                    throw new ParseException("Unexpected token: " + zai3);
                                }
                                if (zai(bufferedReader) == '{') {
                                    this.zat.push(1);
                                } else {
                                    throw new ParseException("Expected start of next object in array");
                                }
                            } else {
                                return arrayList;
                            }
                        } catch (IllegalAccessException e2) {
                            throw new ParseException("Error instantiating inner object", e2);
                        } catch (InstantiationException e10) {
                            throw new ParseException("Error instantiating inner object", e10);
                        }
                    }
                } else {
                    throw new ParseException("Unexpected token: " + zai2);
                }
            } else {
                zax(bufferedReader, zaa);
                zaw(5);
                return null;
            }
        } else {
            zaw(5);
            return arrayList;
        }
    }

    private final void zaw(int i10) throws ParseException {
        if (!this.zat.isEmpty()) {
            int intValue = ((Integer) this.zat.pop()).intValue();
            if (intValue == i10) {
                return;
            } else {
                throw new ParseException(j.e("Expected state ", i10, " but had ", intValue));
            }
        }
        throw new ParseException(a.i("Expected state ", i10, " but had empty stack"));
    }

    private final void zax(BufferedReader bufferedReader, char[] cArr) throws ParseException, IOException {
        int i10 = 0;
        while (true) {
            int length = cArr.length;
            if (i10 < length) {
                int read = bufferedReader.read(this.zap, 0, length - i10);
                if (read != -1) {
                    for (int i11 = 0; i11 < read; i11++) {
                        if (cArr[i11 + i10] != this.zap[i11]) {
                            throw new ParseException("Unexpected character");
                        }
                    }
                    i10 += read;
                } else {
                    throw new ParseException("Unexpected EOF");
                }
            } else {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zay(BufferedReader bufferedReader, boolean z10) throws ParseException, IOException {
        char[] cArr;
        char[] cArr2;
        char zai2 = zai(bufferedReader);
        if (zai2 != '\"') {
            if (zai2 != 'f') {
                if (zai2 != 'n') {
                    if (zai2 == 't') {
                        if (z10) {
                            cArr2 = zac;
                        } else {
                            cArr2 = zab;
                        }
                        zax(bufferedReader, cArr2);
                        return true;
                    }
                    throw new ParseException("Unexpected token: " + zai2);
                }
                zax(bufferedReader, zaa);
                return false;
            }
            if (z10) {
                cArr = zae;
            } else {
                cArr = zad;
            }
            zax(bufferedReader, cArr);
            return false;
        }
        if (!z10) {
            return zay(bufferedReader, true);
        }
        throw new ParseException("No boolean value found in string");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0035. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x025a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0241 A[SYNTHETIC] */
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean zaz(java.io.BufferedReader r14, com.google.android.gms.common.server.response.FastJsonResponse r15) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 646
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.server.response.FastParser.zaz(java.io.BufferedReader, com.google.android.gms.common.server.response.FastJsonResponse):boolean");
    }

    @KeepForSdk
    public void parse(@NonNull InputStream inputStream, @NonNull T t5) throws ParseException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream), LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
        try {
            try {
                this.zat.push(0);
                char zai2 = zai(bufferedReader);
                if (zai2 != 0) {
                    if (zai2 != '[') {
                        if (zai2 == '{') {
                            this.zat.push(1);
                            zaz(bufferedReader, t5);
                        } else {
                            throw new ParseException("Unexpected token: " + zai2);
                        }
                    } else {
                        this.zat.push(5);
                        Map<String, FastJsonResponse.Field<?, ?>> fieldMappings = t5.getFieldMappings();
                        if (fieldMappings.size() == 1) {
                            FastJsonResponse.Field<?, ?> value = fieldMappings.entrySet().iterator().next().getValue();
                            t5.addConcreteTypeArrayInternal(value, value.zae, zav(bufferedReader, value));
                        } else {
                            throw new ParseException("Object array response class must have a single Field");
                        }
                    }
                    zaw(0);
                    try {
                        bufferedReader.close();
                        return;
                    } catch (IOException unused) {
                        Log.w("FastParser", "Failed to close reader while parsing.");
                        return;
                    }
                }
                throw new ParseException("No data to parse");
            } catch (IOException e2) {
                throw new ParseException(e2);
            }
        } catch (Throwable th2) {
            try {
                bufferedReader.close();
            } catch (IOException unused2) {
                Log.w("FastParser", "Failed to close reader while parsing.");
            }
            throw th2;
        }
    }
}
