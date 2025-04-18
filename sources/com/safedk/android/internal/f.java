package com.safedk.android.internal;

import android.support.annotation.NonNull;
import com.google.common.net.HttpHeaders;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.partials.NetworkBridge;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.k;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class f extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    private static final String f29958a = "SafeDKInputStream";

    /* renamed from: b, reason: collision with root package name */
    private final boolean f29959b;

    /* renamed from: c, reason: collision with root package name */
    private final String f29960c;
    private final String d;
    private final InputStream e;

    /* renamed from: i, reason: collision with root package name */
    private Map<String, List<String>> f29964i;

    /* renamed from: k, reason: collision with root package name */
    private HttpURLConnection f29966k;

    /* renamed from: g, reason: collision with root package name */
    private boolean f29962g = false;

    /* renamed from: h, reason: collision with root package name */
    private int f29963h = 0;

    /* renamed from: j, reason: collision with root package name */
    private ByteArrayOutputStream f29965j = new ByteArrayOutputStream();

    /* renamed from: f, reason: collision with root package name */
    private final long f29961f = System.currentTimeMillis();

    public f(String str, String str2, InputStream inputStream, Map<String, List<String>> map, boolean z2) {
        this.f29960c = str;
        this.d = str2;
        this.e = inputStream;
        this.f29964i = map;
        this.f29959b = z2;
    }

    public void a(HttpURLConnection httpURLConnection) {
        this.f29966k = httpURLConnection;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.e != null) {
            int read = this.e.read();
            if (read >= 0) {
                try {
                    this.f29965j.write(read);
                    return read;
                } catch (Throwable th) {
                    try {
                        Logger.e(f29958a, th.getMessage());
                        return read;
                    } catch (Throwable th2) {
                        return read;
                    }
                }
            }
            return read;
        }
        return 0;
    }

    @Override // java.io.InputStream
    public int read(@NonNull byte[] b2) throws IOException {
        if (this.e == null) {
            return 0;
        }
        int read = this.e.read(b2);
        a(b2, 0, read);
        return read;
    }

    @Override // java.io.InputStream
    public int read(@NonNull byte[] b2, int off, int len) throws IOException {
        if (this.e == null) {
            return 0;
        }
        int read = this.e.read(b2, off, len);
        a(b2, off, read);
        return read;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        if (this.e != null) {
            return this.e.available();
        }
        return 0;
    }

    @Override // java.io.InputStream
    public long skip(long n2) throws IOException {
        if (this.e != null) {
            return this.e.skip(n2);
        }
        return 0L;
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        if (this.e != null) {
            this.e.reset();
        }
    }

    private int a(ByteArrayOutputStream byteArrayOutputStream) {
        if (byteArrayOutputStream != null) {
            return byteArrayOutputStream.size();
        }
        return 0;
    }

    private void b() {
        int read;
        do {
            try {
                read = this.e.read();
                if (read > 0) {
                    this.f29965j.write(read);
                }
            } catch (Exception e) {
                Logger.d(f29958a, "read all before close - exception= " + e);
                return;
            }
        } while (read > 0);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            if (this.e != null) {
                b();
                int a2 = a(this.f29965j);
                int c2 = c(this.f29964i);
                if (c2 == a2) {
                    Logger.d(f29958a, "closing the stream, " + this + ", with amount read: " + a2);
                    this.e.close();
                } else if (c2 > -1) {
                    Logger.d(f29958a, "Attempt to close the stream, " + this + ", before reading all of it has been made! amount read: " + a2 + ", content size: " + c2 + " sdk: " + this.f29960c);
                }
            }
        } catch (Throwable th) {
            Logger.d(f29958a, "Exception closing input stream : " + th.getMessage(), th);
        } finally {
            a("sc");
        }
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        if (this.e != null) {
            return this.e.markSupported();
        }
        return false;
    }

    public void a() {
        if (!this.f29962g) {
            a("cd");
        }
    }

    private void a(byte[] bArr, int i2, int i3) {
        try {
            Logger.d(f29958a, "handle stream read started. " + this + ", off=" + i2 + ", res=" + i3);
            if (i3 > 0 && this.f29965j != null) {
                this.f29965j.write(bArr, i2, i3);
            }
            if (b(this.f29964i) && i3 == -1) {
                a("sr-lc");
            }
            if (this.f29959b && this.f29965j != null) {
                int c2 = c(this.f29964i);
                int size = this.f29965j.size();
                if (c2 > -1) {
                    Logger.d(f29958a, "handle stream read, " + this + ", header content size: " + c2 + ", current buffer size: " + size);
                    if (c2 == size) {
                        Logger.d(f29958a, "handle stream read, " + this + ", header content size == current buffer size, calling handleClose");
                        a("sr-cs");
                    }
                } else if (a(this.f29964i)) {
                    Logger.d(f29958a, "handle stream read, " + this + ", header content size is -1, read bytes: " + i3 + ", previous: " + this.f29963h);
                    if (i3 < this.f29963h) {
                        Logger.d(f29958a, "handle stream read, " + this + ", read bytes < previous read bytes, calling handleClose");
                        a("sr-rb");
                    }
                }
                this.f29963h = i3;
            }
        } catch (Throwable th) {
            try {
                Logger.e(f29958a, th.getMessage(), th);
            } catch (Throwable th2) {
            }
        }
    }

    public void a(String str) {
        String byteArrayOutputStream;
        try {
            if (!b(this.f29964i) && this.f29965j != null && this.f29965j.size() == 0) {
                Logger.d(f29958a, "handle close, " + this + ", streamData.size()=0, exiting.");
                return;
            }
            if (this.f29962g) {
                Logger.d(f29958a, "handle close, " + this + ", already closed, exiting.");
                return;
            }
            this.f29962g = true;
            com.safedk.android.analytics.brandsafety.creatives.a i2 = CreativeInfoManager.i(this.f29960c);
            boolean b2 = i2 != null ? i2.b(AdNetworkConfiguration.SUPPORTS_GZIP_CONTENT) : false;
            Logger.d(f29958a, "handle close, " + this + ", sdk " + this.f29960c + " configuration item SUPPORTS_GZIP_CONTENT is " + b2);
            if (b2 && a(this.f29964i)) {
                Logger.d(f29958a, "handle close, " + this + ", gzip content detected");
                byteArrayOutputStream = com.safedk.android.utils.c.a(this.f29965j.toByteArray());
                k.b(f29958a, "handle close, gzipped content (" + (byteArrayOutputStream != null ? byteArrayOutputStream.length() : 0) + ") is " + byteArrayOutputStream);
                if (byteArrayOutputStream == null) {
                    Logger.d(f29958a, "handle close, " + this + ", failed to unzip content, exiting");
                    this.f29962g = false;
                    return;
                }
            } else {
                byteArrayOutputStream = this.f29965j.toString();
            }
            boolean z2 = byteArrayOutputStream == null || byteArrayOutputStream.length() == 0;
            if (!this.f29960c.equals(com.safedk.android.utils.g.f30061p) || !z2) {
                String str2 = this.f29961f + ";" + str + ";" + (System.currentTimeMillis() - this.f29961f);
                Logger.d(f29958a, "handle close, " + this + ", calling onAdFetched, content size is " + byteArrayOutputStream.length() + ", stream close data: (" + str2 + ")");
                CreativeInfoManager.a(this.f29960c, this.d, byteArrayOutputStream, this.f29964i, str2);
            } else {
                Logger.d(f29958a, "handle close, " + this + ", Fyber url with empty body, skipping");
            }
            this.f29965j = null;
            this.f29964i = null;
            if (this.f29966k != null) {
                NetworkBridge.disposeOfConnectionToStreamMapping(this.f29966k);
            }
        } catch (Throwable th) {
            try {
                Logger.e(f29958a, th.getMessage());
            } catch (Throwable th2) {
            }
        }
    }

    private static boolean a(Map<String, List<String>> map) {
        if (map == null) {
            return false;
        }
        List<String> list = map.get(HttpHeaders.CONTENT_ENCODING);
        Logger.d(f29958a, "get response content encoding: " + list);
        return list != null && list.contains("gzip");
    }

    private static boolean b(Map<String, List<String>> map) {
        if (map == null) {
            return false;
        }
        List<String> list = map.get(HttpHeaders.TRANSFER_ENCODING);
        Logger.d(f29958a, "get response transfer encoding: " + list);
        return list != null && list.contains("chunked");
    }

    private static int c(Map<String, List<String>> map) {
        if (map != null) {
            Logger.d(f29958a, "get header content size, headers: " + map);
            List<String> list = map.get(HttpHeaders.CONTENT_LENGTH);
            Logger.d(f29958a, "get header content size: " + list);
            if (list != null) {
                return Integer.parseInt(list.get(0));
            }
        }
        return -1;
    }
}
