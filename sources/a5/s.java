package a5;

import android.util.Log;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class s implements Callable {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final int f235b;

    public s(String str, int i10) {
        this.a = str;
        this.f235b = i10;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Throwable th2;
        Socket socket;
        try {
            socket = new Socket(this.a, this.f235b);
        } catch (Throwable th3) {
            th2 = th3;
            socket = null;
        }
        try {
            socket.setSoTimeout(2000);
            OutputStream outputStream = socket.getOutputStream();
            outputStream.write("Ping\n".getBytes(i5.a.f19154b));
            outputStream.flush();
            if ("OK".equals(new BufferedReader(new InputStreamReader(socket.getInputStream())).readLine())) {
                return Boolean.TRUE;
            }
        } catch (Throwable th4) {
            th2 = th4;
            try {
                th2.getMessage();
                Log.getStackTraceString(th2);
                i5.a.k(socket);
                return Boolean.FALSE;
            } finally {
                i5.a.k(socket);
            }
        }
        i5.a.k(socket);
        return Boolean.FALSE;
    }
}
