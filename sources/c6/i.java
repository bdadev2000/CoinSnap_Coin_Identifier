package c6;

import android.os.AsyncTask;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class i extends AsyncTask {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final File f2636b;

    /* renamed from: c, reason: collision with root package name */
    public final h f2637c;

    public i(String uriStr, File destFile, h onSuccess) {
        Intrinsics.checkNotNullParameter(uriStr, "uriStr");
        Intrinsics.checkNotNullParameter(destFile, "destFile");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        this.a = uriStr;
        this.f2636b = destFile;
        this.f2637c = onSuccess;
    }

    public final Boolean a(String... args) {
        if (m6.a.b(this)) {
            return null;
        }
        try {
            if (m6.a.b(this)) {
                return null;
            }
            try {
                if (m6.a.b(this)) {
                    return null;
                }
                try {
                    Intrinsics.checkNotNullParameter(args, "args");
                    try {
                        URL url = new URL(this.a);
                        int contentLength = url.openConnection().getContentLength();
                        DataInputStream dataInputStream = new DataInputStream(url.openStream());
                        byte[] bArr = new byte[contentLength];
                        dataInputStream.readFully(bArr);
                        dataInputStream.close();
                        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(this.f2636b));
                        dataOutputStream.write(bArr);
                        dataOutputStream.flush();
                        dataOutputStream.close();
                        return Boolean.TRUE;
                    } catch (Exception unused) {
                        return Boolean.FALSE;
                    }
                } catch (Throwable th2) {
                    m6.a.a(this, th2);
                    return null;
                }
            } catch (Throwable th3) {
                m6.a.a(this, th3);
                return null;
            }
        } catch (Throwable th4) {
            m6.a.a(this, th4);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        if (m6.a.b(this)) {
            return null;
        }
        try {
            if (m6.a.b(this)) {
                return null;
            }
            try {
                if (m6.a.b(this)) {
                    return null;
                }
                try {
                    return a((String[]) objArr);
                } catch (Throwable th2) {
                    m6.a.a(this, th2);
                    return null;
                }
            } catch (Throwable th3) {
                m6.a.a(this, th3);
                return null;
            }
        } catch (Throwable th4) {
            m6.a.a(this, th4);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        if (m6.a.b(this)) {
            return;
        }
        try {
            if (m6.a.b(this)) {
                return;
            }
            try {
                if (m6.a.b(this)) {
                    return;
                }
                try {
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    if (!m6.a.b(this)) {
                        try {
                            if (!m6.a.b(this)) {
                                try {
                                    if (!m6.a.b(this) && booleanValue) {
                                        try {
                                            this.f2637c.a(this.f2636b);
                                        } catch (Throwable th2) {
                                            m6.a.a(this, th2);
                                        }
                                    }
                                } catch (Throwable th3) {
                                    m6.a.a(this, th3);
                                }
                            }
                        } catch (Throwable th4) {
                            m6.a.a(this, th4);
                        }
                    }
                } catch (Throwable th5) {
                    m6.a.a(this, th5);
                }
            } catch (Throwable th6) {
                m6.a.a(this, th6);
            }
        } catch (Throwable th7) {
            m6.a.a(this, th7);
        }
    }
}
