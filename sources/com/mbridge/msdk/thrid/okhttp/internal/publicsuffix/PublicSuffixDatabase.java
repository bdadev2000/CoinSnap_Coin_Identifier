package com.mbridge.msdk.thrid.okhttp.internal.publicsuffix;

import com.mbridge.msdk.thrid.okhttp.internal.Util;
import com.mbridge.msdk.thrid.okhttp.internal.platform.Platform;
import com.mbridge.msdk.thrid.okio.BufferedSource;
import com.mbridge.msdk.thrid.okio.GzipSource;
import com.mbridge.msdk.thrid.okio.Okio;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class PublicSuffixDatabase {
    private static final byte EXCEPTION_MARKER = 33;
    public static final String PUBLIC_SUFFIX_RESOURCE = "publicsuffixes.gz";
    private byte[] publicSuffixExceptionListBytes;
    private byte[] publicSuffixListBytes;
    private static final byte[] WILDCARD_LABEL = {42};
    private static final String[] EMPTY_RULE = new String[0];
    private static final String[] PREVAILING_RULE = {"*"};
    private static final PublicSuffixDatabase instance = new PublicSuffixDatabase();
    private final AtomicBoolean listRead = new AtomicBoolean(false);
    private final CountDownLatch readCompleteLatch = new CountDownLatch(1);

    private static String binarySearchBytes(byte[] bArr, byte[][] bArr2, int i9) {
        int i10;
        boolean z8;
        int i11;
        int i12;
        int length = bArr.length;
        int i13 = 0;
        while (i13 < length) {
            int i14 = (i13 + length) / 2;
            while (i14 > -1 && bArr[i14] != 10) {
                i14--;
            }
            int i15 = i14 + 1;
            int i16 = 1;
            while (true) {
                i10 = i15 + i16;
                if (bArr[i10] == 10) {
                    break;
                }
                i16++;
            }
            int i17 = i10 - i15;
            int i18 = i9;
            boolean z9 = false;
            int i19 = 0;
            int i20 = 0;
            while (true) {
                if (z9) {
                    i11 = 46;
                    z8 = false;
                } else {
                    z8 = z9;
                    i11 = bArr2[i18][i19] & 255;
                }
                i12 = i11 - (bArr[i15 + i20] & 255);
                if (i12 == 0) {
                    i20++;
                    i19++;
                    if (i20 == i17) {
                        break;
                    }
                    if (bArr2[i18].length == i19) {
                        if (i18 == bArr2.length - 1) {
                            break;
                        }
                        i18++;
                        i19 = -1;
                        z9 = true;
                    } else {
                        z9 = z8;
                    }
                } else {
                    break;
                }
            }
            if (i12 >= 0) {
                if (i12 <= 0) {
                    int i21 = i17 - i20;
                    int length2 = bArr2[i18].length - i19;
                    while (true) {
                        i18++;
                        if (i18 >= bArr2.length) {
                            break;
                        }
                        length2 += bArr2[i18].length;
                    }
                    if (length2 >= i21) {
                        if (length2 <= i21) {
                            return new String(bArr, i15, i17, Util.UTF_8);
                        }
                    }
                }
                i13 = i10 + 1;
            }
            length = i14;
        }
        return null;
    }

    private String[] findMatchingRule(String[] strArr) {
        String str;
        String str2;
        String str3;
        String[] strArr2;
        String[] strArr3;
        int i9 = 0;
        if (!this.listRead.get() && this.listRead.compareAndSet(false, true)) {
            readTheListUninterruptibly();
        } else {
            try {
                this.readCompleteLatch.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
        synchronized (this) {
            if (this.publicSuffixListBytes == null) {
                throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
            }
        }
        int length = strArr.length;
        byte[][] bArr = new byte[length];
        for (int i10 = 0; i10 < strArr.length; i10++) {
            bArr[i10] = strArr[i10].getBytes(Util.UTF_8);
        }
        int i11 = 0;
        while (true) {
            str = null;
            if (i11 < length) {
                str2 = binarySearchBytes(this.publicSuffixListBytes, bArr, i11);
                if (str2 != null) {
                    break;
                }
                i11++;
            } else {
                str2 = null;
                break;
            }
        }
        if (length > 1) {
            byte[][] bArr2 = (byte[][]) bArr.clone();
            for (int i12 = 0; i12 < bArr2.length - 1; i12++) {
                bArr2[i12] = WILDCARD_LABEL;
                str3 = binarySearchBytes(this.publicSuffixListBytes, bArr2, i12);
                if (str3 != null) {
                    break;
                }
            }
        }
        str3 = null;
        if (str3 != null) {
            while (true) {
                if (i9 >= length - 1) {
                    break;
                }
                String binarySearchBytes = binarySearchBytes(this.publicSuffixExceptionListBytes, bArr, i9);
                if (binarySearchBytes != null) {
                    str = binarySearchBytes;
                    break;
                }
                i9++;
            }
        }
        if (str != null) {
            return "!".concat(str).split("\\.");
        }
        if (str2 == null && str3 == null) {
            return PREVAILING_RULE;
        }
        if (str2 != null) {
            strArr2 = str2.split("\\.");
        } else {
            strArr2 = EMPTY_RULE;
        }
        if (str3 != null) {
            strArr3 = str3.split("\\.");
        } else {
            strArr3 = EMPTY_RULE;
        }
        if (strArr2.length <= strArr3.length) {
            return strArr3;
        }
        return strArr2;
    }

    public static PublicSuffixDatabase get() {
        return instance;
    }

    private void readTheList() throws IOException {
        InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream(PUBLIC_SUFFIX_RESOURCE);
        if (resourceAsStream == null) {
            return;
        }
        BufferedSource buffer = Okio.buffer(new GzipSource(Okio.source(resourceAsStream)));
        try {
            byte[] bArr = new byte[buffer.readInt()];
            buffer.readFully(bArr);
            byte[] bArr2 = new byte[buffer.readInt()];
            buffer.readFully(bArr2);
            synchronized (this) {
                this.publicSuffixListBytes = bArr;
                this.publicSuffixExceptionListBytes = bArr2;
            }
            this.readCompleteLatch.countDown();
        } finally {
            Util.closeQuietly(buffer);
        }
    }

    private void readTheListUninterruptibly() {
        boolean z8 = false;
        while (true) {
            try {
                try {
                    readTheList();
                    break;
                } catch (InterruptedIOException unused) {
                    Thread.interrupted();
                    z8 = true;
                } catch (IOException e4) {
                    Platform.get().log(5, "Failed to read public suffix list", e4);
                    if (z8) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    return;
                }
            } catch (Throwable th) {
                if (z8) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z8) {
            Thread.currentThread().interrupt();
        }
    }

    public String getEffectiveTldPlusOne(String str) {
        int length;
        int length2;
        if (str != null) {
            String[] split = IDN.toUnicode(str).split("\\.");
            String[] findMatchingRule = findMatchingRule(split);
            if (split.length == findMatchingRule.length && findMatchingRule[0].charAt(0) != '!') {
                return null;
            }
            if (findMatchingRule[0].charAt(0) == '!') {
                length = split.length;
                length2 = findMatchingRule.length;
            } else {
                length = split.length;
                length2 = findMatchingRule.length + 1;
            }
            StringBuilder sb = new StringBuilder();
            String[] split2 = str.split("\\.");
            for (int i9 = length - length2; i9 < split2.length; i9++) {
                sb.append(split2[i9]);
                sb.append('.');
            }
            sb.deleteCharAt(sb.length() - 1);
            return sb.toString();
        }
        throw new NullPointerException("domain == null");
    }

    public void setListBytes(byte[] bArr, byte[] bArr2) {
        this.publicSuffixListBytes = bArr;
        this.publicSuffixExceptionListBytes = bArr2;
        this.listRead.set(true);
        this.readCompleteLatch.countDown();
    }
}
