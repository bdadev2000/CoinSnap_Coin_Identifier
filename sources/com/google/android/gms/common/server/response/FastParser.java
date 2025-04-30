package com.google.android.gms.common.server.response;

import Q7.n0;
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

@ShowFirstParty
@KeepForSdk
/* loaded from: classes2.dex */
public class FastParser<T extends FastJsonResponse> {
    private static final char[] zaa = {'u', 'l', 'l'};
    private static final char[] zab = {'r', 'u', 'e'};
    private static final char[] zac = {'r', 'u', 'e', '\"'};
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
    private final char[] zaq = new char[1024];
    private final StringBuilder zar = new StringBuilder(32);
    private final StringBuilder zas = new StringBuilder(1024);
    private final Stack zat = new Stack();

    @ShowFirstParty
    @KeepForSdk
    /* loaded from: classes2.dex */
    public static class ParseException extends Exception {
        public ParseException(@NonNull String str) {
            super(str);
        }

        public ParseException(@NonNull String str, @NonNull Throwable th) {
            super("Error instantiating inner object", th);
        }

        public ParseException(@NonNull Throwable th) {
            super(th);
        }
    }

    private static final String zaA(BufferedReader bufferedReader, char[] cArr, StringBuilder sb, @Nullable char[] cArr2) throws ParseException, IOException {
        sb.setLength(0);
        bufferedReader.mark(cArr.length);
        boolean z8 = false;
        boolean z9 = false;
        loop0: while (true) {
            int read = bufferedReader.read(cArr);
            if (read != -1) {
                int i9 = 0;
                while (i9 < read) {
                    char c9 = cArr[i9];
                    if (!Character.isISOControl(c9) || (cArr2 != null && cArr2[0] == c9)) {
                        int i10 = i9 + 1;
                        if (c9 == '\"') {
                            if (!z8) {
                                sb.append(cArr, 0, i9);
                                bufferedReader.reset();
                                bufferedReader.skip(i10);
                                if (z9) {
                                    return JsonUtils.unescapeString(sb.toString());
                                }
                                return sb.toString();
                            }
                        } else if (c9 == '\\') {
                            z8 = !z8;
                            z9 = true;
                            i9 = i10;
                        }
                        z8 = false;
                        i9 = i10;
                    }
                }
                sb.append(cArr, 0, read);
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
        int i9;
        int i10;
        int i11;
        int i12;
        int zam2 = zam(bufferedReader, this.zaq);
        if (zam2 == 0) {
            return 0;
        }
        char[] cArr = this.zaq;
        if (zam2 > 0) {
            char c9 = cArr[0];
            if (c9 == '-') {
                i9 = Integer.MIN_VALUE;
            } else {
                i9 = -2147483647;
            }
            if (c9 == '-') {
                i10 = 1;
            } else {
                i10 = 0;
            }
            if (i10 < zam2) {
                i12 = i10 + 1;
                int digit = Character.digit(cArr[i10], 10);
                if (digit >= 0) {
                    i11 = -digit;
                } else {
                    throw new ParseException("Unexpected non-digit character");
                }
            } else {
                i11 = 0;
                i12 = i10;
            }
            while (i12 < zam2) {
                int i13 = i12 + 1;
                int digit2 = Character.digit(cArr[i12], 10);
                if (digit2 >= 0) {
                    if (i11 >= -214748364) {
                        int i14 = i11 * 10;
                        if (i14 >= i9 + digit2) {
                            i11 = i14 - digit2;
                            i12 = i13;
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
            if (i10 != 0) {
                if (i12 <= 1) {
                    throw new ParseException("No digits to parse");
                }
                return i11;
            }
            return -i11;
        }
        throw new ParseException("No number to parse");
    }

    @ResultIgnorabilityUnspecified
    private final int zam(BufferedReader bufferedReader, char[] cArr) throws ParseException, IOException {
        int i9;
        char zai2 = zai(bufferedReader);
        if (zai2 != 0) {
            if (zai2 != ',') {
                if (zai2 == 'n') {
                    zax(bufferedReader, zaa);
                    return 0;
                }
                bufferedReader.mark(1024);
                if (zai2 == '\"') {
                    i9 = 0;
                    boolean z8 = false;
                    while (i9 < 1024 && bufferedReader.read(cArr, i9, 1) != -1) {
                        char c9 = cArr[i9];
                        if (!Character.isISOControl(c9)) {
                            int i10 = i9 + 1;
                            if (c9 == '\"') {
                                if (!z8) {
                                    bufferedReader.reset();
                                    bufferedReader.skip(i10);
                                    return i9;
                                }
                            } else if (c9 == '\\') {
                                z8 = !z8;
                                i9 = i10;
                            }
                            z8 = false;
                            i9 = i10;
                        } else {
                            throw new ParseException("Unexpected control character while reading string");
                        }
                    }
                } else {
                    cArr[0] = zai2;
                    i9 = 1;
                    while (i9 < 1024 && bufferedReader.read(cArr, i9, 1) != -1) {
                        char c10 = cArr[i9];
                        if (c10 != '}' && c10 != ',' && !Character.isWhitespace(c10) && cArr[i9] != ']') {
                            i9++;
                        } else {
                            bufferedReader.reset();
                            bufferedReader.skip(i9 - 1);
                            cArr[i9] = 0;
                            return i9;
                        }
                    }
                }
                if (i9 == 1024) {
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
        long j7;
        long j9;
        int i9;
        int zam2 = zam(bufferedReader, this.zaq);
        if (zam2 == 0) {
            return 0L;
        }
        char[] cArr = this.zaq;
        if (zam2 > 0) {
            int i10 = 0;
            char c9 = cArr[0];
            if (c9 == '-') {
                j7 = Long.MIN_VALUE;
            } else {
                j7 = C.TIME_UNSET;
            }
            if (c9 == '-') {
                i10 = 1;
            }
            if (i10 < zam2) {
                i9 = i10 + 1;
                int digit = Character.digit(cArr[i10], 10);
                if (digit >= 0) {
                    j9 = -digit;
                } else {
                    throw new ParseException("Unexpected non-digit character");
                }
            } else {
                j9 = 0;
                i9 = i10;
            }
            while (i9 < zam2) {
                int i11 = i9 + 1;
                int digit2 = Character.digit(cArr[i9], 10);
                if (digit2 >= 0) {
                    if (j9 >= -922337203685477580L) {
                        long j10 = j9 * 10;
                        int i12 = zam2;
                        long j11 = digit2;
                        if (j10 >= j7 + j11) {
                            j9 = j10 - j11;
                            zam2 = i12;
                            i9 = i11;
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
            if (i10 != 0) {
                if (i9 <= 1) {
                    throw new ParseException("No digits to parse");
                }
                return j9;
            }
            return -j9;
        }
        throw new ParseException("No number to parse");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    public final String zao(BufferedReader bufferedReader) throws ParseException, IOException {
        return zap(bufferedReader, this.zap, this.zar, null);
    }

    @Nullable
    private final String zap(BufferedReader bufferedReader, char[] cArr, StringBuilder sb, @Nullable char[] cArr2) throws ParseException, IOException {
        char zai2 = zai(bufferedReader);
        if (zai2 != '\"') {
            if (zai2 == 'n') {
                zax(bufferedReader, zaa);
                return null;
            }
            throw new ParseException("Expected string");
        }
        return zaA(bufferedReader, cArr, sb, cArr2);
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
        bufferedReader.mark(1024);
        char zai2 = zai(bufferedReader);
        int i9 = 1;
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
                        boolean z8 = false;
                        boolean z9 = false;
                        while (i9 > 0) {
                            char zai4 = zai(bufferedReader);
                            if (zai4 != 0) {
                                if (!Character.isISOControl(zai4)) {
                                    if (zai4 == '\"') {
                                        if (!z9) {
                                            z8 = !z8;
                                        }
                                        zai4 = '\"';
                                    }
                                    if (zai4 == '[') {
                                        if (!z8) {
                                            i9++;
                                        }
                                        zai4 = '[';
                                    }
                                    if (zai4 == ']' && !z8) {
                                        i9--;
                                    }
                                    if (zai4 == '\\' && z8) {
                                        z9 = !z9;
                                    } else {
                                        z9 = false;
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
                char c9 = this.zao[0];
                boolean z10 = false;
                do {
                    if (c9 == '\"') {
                        if (z10) {
                            c9 = '\"';
                            z10 = true;
                        }
                    }
                    if (c9 == '\\') {
                        z10 = !z10;
                    } else {
                        z10 = false;
                    }
                    if (bufferedReader.read(this.zao) != -1) {
                        c9 = this.zao[0];
                    } else {
                        throw new ParseException("Unexpected EOF while parsing string");
                    }
                } while (!Character.isISOControl(c9));
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
                bufferedReader.mark(1024);
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
                        } catch (IllegalAccessException e4) {
                            throw new ParseException("Error instantiating inner object", e4);
                        } catch (InstantiationException e9) {
                            throw new ParseException("Error instantiating inner object", e9);
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

    private final void zaw(int i9) throws ParseException {
        if (!this.zat.isEmpty()) {
            int intValue = ((Integer) this.zat.pop()).intValue();
            if (intValue == i9) {
                return;
            } else {
                throw new ParseException(n0.e(i9, intValue, "Expected state ", " but had "));
            }
        }
        throw new ParseException(n0.f(i9, "Expected state ", " but had empty stack"));
    }

    private final void zax(BufferedReader bufferedReader, char[] cArr) throws ParseException, IOException {
        int i9 = 0;
        while (true) {
            int length = cArr.length;
            if (i9 < length) {
                int read = bufferedReader.read(this.zap, 0, length - i9);
                if (read != -1) {
                    for (int i10 = 0; i10 < read; i10++) {
                        if (cArr[i10 + i9] != this.zap[i10]) {
                            throw new ParseException("Unexpected character");
                        }
                    }
                    i9 += read;
                } else {
                    throw new ParseException("Unexpected EOF");
                }
            } else {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zay(BufferedReader bufferedReader, boolean z8) throws ParseException, IOException {
        char[] cArr;
        char[] cArr2;
        char zai2 = zai(bufferedReader);
        if (zai2 != '\"') {
            if (zai2 != 'f') {
                if (zai2 != 'n') {
                    if (zai2 == 't') {
                        if (z8) {
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
            if (z8) {
                cArr = zae;
            } else {
                cArr = zad;
            }
            zax(bufferedReader, cArr);
            return false;
        }
        if (!z8) {
            return zay(bufferedReader, true);
        }
        throw new ParseException("No boolean value found in string");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x003b. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x026a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0251 A[SYNTHETIC] */
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean zaz(java.io.BufferedReader r17, com.google.android.gms.common.server.response.FastJsonResponse r18) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 662
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.server.response.FastParser.zaz(java.io.BufferedReader, com.google.android.gms.common.server.response.FastJsonResponse):boolean");
    }

    @KeepForSdk
    public void parse(@NonNull InputStream inputStream, @NonNull T t9) throws ParseException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream), 1024);
        try {
            try {
                this.zat.push(0);
                char zai2 = zai(bufferedReader);
                if (zai2 != 0) {
                    if (zai2 != '[') {
                        if (zai2 == '{') {
                            this.zat.push(1);
                            zaz(bufferedReader, t9);
                        } else {
                            throw new ParseException("Unexpected token: " + zai2);
                        }
                    } else {
                        this.zat.push(5);
                        Map<String, FastJsonResponse.Field<?, ?>> fieldMappings = t9.getFieldMappings();
                        if (fieldMappings.size() == 1) {
                            FastJsonResponse.Field<?, ?> value = fieldMappings.entrySet().iterator().next().getValue();
                            t9.addConcreteTypeArrayInternal(value, value.zae, zav(bufferedReader, value));
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
            } catch (IOException e4) {
                throw new ParseException(e4);
            }
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (IOException unused2) {
                Log.w("FastParser", "Failed to close reader while parsing.");
            }
            throw th;
        }
    }
}
