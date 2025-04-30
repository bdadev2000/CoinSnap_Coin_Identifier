package H1;

import android.graphics.Path;
import android.graphics.PathMeasure;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Random;

/* loaded from: classes.dex */
public final class h extends ThreadLocal {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1366a;

    public /* synthetic */ h(int i9) {
        this.f1366a = i9;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.f1366a) {
            case 0:
                return new PathMeasure();
            case 1:
                return new Path();
            case 2:
                return new Path();
            case 3:
                return new float[4];
            case 4:
                return new Random();
            default:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(j8.b.f21217e);
                return simpleDateFormat;
        }
    }
}
