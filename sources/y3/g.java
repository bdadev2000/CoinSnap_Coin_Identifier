package y3;

import android.graphics.Path;
import android.graphics.PathMeasure;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* loaded from: classes.dex */
public final class g extends ThreadLocal {
    public final /* synthetic */ int a;

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        int i10 = this.a;
        switch (i10) {
            case 0:
                return new PathMeasure();
            case 1:
                switch (i10) {
                    case 1:
                        return new Path();
                    default:
                        return new Path();
                }
            case 2:
                switch (i10) {
                    case 1:
                        return new Path();
                    default:
                        return new Path();
                }
            case 3:
                return new float[4];
            default:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(xh.b.f27680e);
                return simpleDateFormat;
        }
    }
}
