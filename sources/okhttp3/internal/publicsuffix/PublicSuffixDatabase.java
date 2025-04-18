package okhttp3.internal.publicsuffix;

import android.support.v4.media.d;
import b1.f0;
import e0.u;
import e0.w;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.q;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;
import okio.BufferedSource;
import okio.GzipSource;
import okio.Okio;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;
import y0.b;
import y0.c;
import y0.j;
import z0.m;

/* loaded from: classes.dex */
public final class PublicSuffixDatabase {
    private static final char EXCEPTION_MARKER = '!';

    @NotNull
    public static final String PUBLIC_SUFFIX_RESOURCE = "publicsuffixes.gz";
    private byte[] publicSuffixExceptionListBytes;
    private byte[] publicSuffixListBytes;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final byte[] WILDCARD_LABEL = {42};

    @NotNull
    private static final List<String> PREVAILING_RULE = f0.u("*");

    @NotNull
    private static final PublicSuffixDatabase instance = new PublicSuffixDatabase();

    @NotNull
    private final AtomicBoolean listRead = new AtomicBoolean(false);

    @NotNull
    private final CountDownLatch readCompleteLatch = new CountDownLatch(1);

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String binarySearch(byte[] bArr, byte[][] bArr2, int i2) {
            int i3;
            int and;
            boolean z2;
            int and2;
            int length = bArr.length;
            int i4 = 0;
            while (i4 < length) {
                int i5 = (i4 + length) / 2;
                while (i5 > -1 && bArr[i5] != 10) {
                    i5--;
                }
                int i6 = i5 + 1;
                int i7 = 1;
                while (true) {
                    i3 = i6 + i7;
                    if (bArr[i3] == 10) {
                        break;
                    }
                    i7++;
                }
                int i8 = i3 - i6;
                int i9 = i2;
                boolean z3 = false;
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    if (z3) {
                        and = 46;
                        z2 = false;
                    } else {
                        boolean z4 = z3;
                        and = Util.and(bArr2[i9][i10], 255);
                        z2 = z4;
                    }
                    and2 = and - Util.and(bArr[i6 + i11], 255);
                    if (and2 != 0) {
                        break;
                    }
                    i11++;
                    i10++;
                    if (i11 == i8) {
                        break;
                    }
                    if (bArr2[i9].length != i10) {
                        z3 = z2;
                    } else {
                        if (i9 == bArr2.length - 1) {
                            break;
                        }
                        i9++;
                        z3 = true;
                        i10 = -1;
                    }
                }
                if (and2 >= 0) {
                    if (and2 <= 0) {
                        int i12 = i8 - i11;
                        int length2 = bArr2[i9].length - i10;
                        int length3 = bArr2.length;
                        for (int i13 = i9 + 1; i13 < length3; i13++) {
                            length2 += bArr2[i13].length;
                        }
                        if (length2 >= i12) {
                            if (length2 <= i12) {
                                Charset charset = StandardCharsets.UTF_8;
                                a.r(charset, "UTF_8");
                                return new String(bArr, i6, i8, charset);
                            }
                        }
                    }
                    i4 = i3 + 1;
                }
                length = i5;
            }
            return null;
        }

        @NotNull
        public final PublicSuffixDatabase get() {
            return PublicSuffixDatabase.instance;
        }
    }

    private final List<String> findMatchingRule(List<String> list) {
        String str;
        String str2;
        String str3;
        if (this.listRead.get() || !this.listRead.compareAndSet(false, true)) {
            try {
                this.readCompleteLatch.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            readTheListUninterruptibly();
        }
        if (this.publicSuffixListBytes == null) {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.".toString());
        }
        int size = list.size();
        byte[][] bArr = new byte[size];
        for (int i2 = 0; i2 < size; i2++) {
            String str4 = list.get(i2);
            Charset charset = StandardCharsets.UTF_8;
            a.r(charset, "UTF_8");
            byte[] bytes = str4.getBytes(charset);
            a.r(bytes, "this as java.lang.String).getBytes(charset)");
            bArr[i2] = bytes;
        }
        int i3 = 0;
        while (true) {
            str = null;
            if (i3 >= size) {
                str2 = null;
                break;
            }
            Companion companion = Companion;
            byte[] bArr2 = this.publicSuffixListBytes;
            if (bArr2 == null) {
                a.B0("publicSuffixListBytes");
                throw null;
            }
            str2 = companion.binarySearch(bArr2, bArr, i3);
            if (str2 != null) {
                break;
            }
            i3++;
        }
        if (size > 1) {
            byte[][] bArr3 = (byte[][]) bArr.clone();
            int length = bArr3.length - 1;
            for (int i4 = 0; i4 < length; i4++) {
                bArr3[i4] = WILDCARD_LABEL;
                Companion companion2 = Companion;
                byte[] bArr4 = this.publicSuffixListBytes;
                if (bArr4 == null) {
                    a.B0("publicSuffixListBytes");
                    throw null;
                }
                str3 = companion2.binarySearch(bArr4, bArr3, i4);
                if (str3 != null) {
                    break;
                }
            }
        }
        str3 = null;
        if (str3 != null) {
            int i5 = size - 1;
            int i6 = 0;
            while (true) {
                if (i6 >= i5) {
                    break;
                }
                Companion companion3 = Companion;
                byte[] bArr5 = this.publicSuffixExceptionListBytes;
                if (bArr5 == null) {
                    a.B0("publicSuffixExceptionListBytes");
                    throw null;
                }
                String binarySearch = companion3.binarySearch(bArr5, bArr, i6);
                if (binarySearch != null) {
                    str = binarySearch;
                    break;
                }
                i6++;
            }
        }
        if (str != null) {
            return m.n1("!".concat(str), new char[]{'.'});
        }
        if (str2 == null && str3 == null) {
            return PREVAILING_RULE;
        }
        List<String> list2 = w.f30218a;
        List<String> n12 = str2 != null ? m.n1(str2, new char[]{'.'}) : list2;
        if (str3 != null) {
            list2 = m.n1(str3, new char[]{'.'});
        }
        return n12.size() > list2.size() ? n12 : list2;
    }

    private final void readTheList() throws IOException {
        try {
            InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream(PUBLIC_SUFFIX_RESOURCE);
            if (resourceAsStream == null) {
                return;
            }
            BufferedSource buffer = Okio.buffer(new GzipSource(Okio.source(resourceAsStream)));
            try {
                byte[] readByteArray = buffer.readByteArray(buffer.readInt());
                byte[] readByteArray2 = buffer.readByteArray(buffer.readInt());
                q.b(buffer, null);
                synchronized (this) {
                    a.p(readByteArray);
                    this.publicSuffixListBytes = readByteArray;
                    a.p(readByteArray2);
                    this.publicSuffixExceptionListBytes = readByteArray2;
                }
            } finally {
            }
        } finally {
            this.readCompleteLatch.countDown();
        }
    }

    private final void readTheListUninterruptibly() {
        boolean z2 = false;
        while (true) {
            try {
                try {
                    readTheList();
                    break;
                } catch (InterruptedIOException unused) {
                    Thread.interrupted();
                    z2 = true;
                } catch (IOException e) {
                    Platform.Companion.get().log("Failed to read public suffix list", 5, e);
                    if (z2) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    return;
                }
            } catch (Throwable th) {
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
    }

    private final List<String> splitDomain(String str) {
        List<String> n12 = m.n1(str, new char[]{'.'});
        if (!a.g(u.L0(n12), "")) {
            return n12;
        }
        List<String> list = n12;
        int size = n12.size() - 1;
        return u.U0(list, size >= 0 ? size : 0);
    }

    @Nullable
    public final String getEffectiveTldPlusOne(@NotNull String str) {
        int size;
        int size2;
        a.s(str, "domain");
        String unicode = IDN.toUnicode(str);
        a.r(unicode, "unicodeDomain");
        List<String> splitDomain = splitDomain(unicode);
        List<String> findMatchingRule = findMatchingRule(splitDomain);
        if (splitDomain.size() == findMatchingRule.size() && findMatchingRule.get(0).charAt(0) != '!') {
            return null;
        }
        if (findMatchingRule.get(0).charAt(0) == '!') {
            size = splitDomain.size();
            size2 = findMatchingRule.size();
        } else {
            size = splitDomain.size();
            size2 = findMatchingRule.size() + 1;
        }
        int i2 = size - size2;
        j z02 = u.z0(splitDomain(str));
        if (i2 < 0) {
            throw new IllegalArgumentException(d.j("Requested element count ", i2, " is less than zero.").toString());
        }
        if (i2 != 0) {
            z02 = z02 instanceof c ? ((c) z02).a(i2) : new b(z02, i2, 0);
        }
        return y0.m.O(z02, ".", null, 62);
    }

    public final void setListBytes(@NotNull byte[] bArr, @NotNull byte[] bArr2) {
        a.s(bArr, "publicSuffixListBytes");
        a.s(bArr2, "publicSuffixExceptionListBytes");
        this.publicSuffixListBytes = bArr;
        this.publicSuffixExceptionListBytes = bArr2;
        this.listRead.set(true);
        this.readCompleteLatch.countDown();
    }
}
