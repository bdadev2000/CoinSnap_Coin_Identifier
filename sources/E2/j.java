package E2;

import android.os.AsyncTask;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;
import java.net.URLConnection;

/* loaded from: classes.dex */
public final class j extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public final String f994a;
    public final File b;

    /* renamed from: c, reason: collision with root package name */
    public final i f995c;

    public j(String str, File file, i iVar) {
        G7.j.e(str, "uriStr");
        this.f994a = str;
        this.b = file;
        this.f995c = iVar;
    }

    public final Boolean a(String... strArr) {
        if (O2.a.b(this)) {
            return null;
        }
        try {
            if (O2.a.b(this)) {
                return null;
            }
            try {
                if (O2.a.b(this)) {
                    return null;
                }
                try {
                    G7.j.e(strArr, "args");
                    try {
                        URL url = new URL(this.f994a);
                        int contentLength = ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection())).getContentLength();
                        DataInputStream dataInputStream = new DataInputStream(FirebasePerfUrlConnection.openStream(url));
                        byte[] bArr = new byte[contentLength];
                        dataInputStream.readFully(bArr);
                        dataInputStream.close();
                        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(this.b));
                        dataOutputStream.write(bArr);
                        dataOutputStream.flush();
                        dataOutputStream.close();
                        return Boolean.TRUE;
                    } catch (Exception unused) {
                        return Boolean.FALSE;
                    }
                } catch (Throwable th) {
                    O2.a.a(this, th);
                    return null;
                }
            } catch (Throwable th2) {
                O2.a.a(this, th2);
                return null;
            }
        } catch (Throwable th3) {
            O2.a.a(this, th3);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        if (O2.a.b(this)) {
            return null;
        }
        try {
            if (O2.a.b(this)) {
                return null;
            }
            try {
                if (O2.a.b(this)) {
                    return null;
                }
                try {
                    return a((String[]) objArr);
                } catch (Throwable th) {
                    O2.a.a(this, th);
                    return null;
                }
            } catch (Throwable th2) {
                O2.a.a(this, th2);
                return null;
            }
        } catch (Throwable th3) {
            O2.a.a(this, th3);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        if (O2.a.b(this)) {
            return;
        }
        try {
            if (O2.a.b(this)) {
                return;
            }
            try {
                if (O2.a.b(this)) {
                    return;
                }
                try {
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    if (!O2.a.b(this)) {
                        try {
                            if (!O2.a.b(this)) {
                                try {
                                    if (!O2.a.b(this) && booleanValue) {
                                        try {
                                            this.f995c.c(this.b);
                                        } catch (Throwable th) {
                                            O2.a.a(this, th);
                                        }
                                    }
                                } catch (Throwable th2) {
                                    O2.a.a(this, th2);
                                }
                            }
                        } catch (Throwable th3) {
                            O2.a.a(this, th3);
                        }
                    }
                } catch (Throwable th4) {
                    O2.a.a(this, th4);
                }
            } catch (Throwable th5) {
                O2.a.a(this, th5);
            }
        } catch (Throwable th6) {
            O2.a.a(this, th6);
        }
    }
}
