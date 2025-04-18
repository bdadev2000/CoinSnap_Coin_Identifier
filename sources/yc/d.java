package yc;

import com.google.gson.c0;
import com.google.gson.v;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/* loaded from: classes3.dex */
public final class d extends c0 {

    /* renamed from: b, reason: collision with root package name */
    public static final c f28162b = new c();
    public final SimpleDateFormat a;

    public /* synthetic */ d(int i10) {
        this();
    }

    @Override // com.google.gson.c0
    public final Object b(zc.a aVar) {
        Time time;
        if (aVar.b0() == 9) {
            aVar.X();
            return null;
        }
        String Z = aVar.Z();
        synchronized (this) {
            TimeZone timeZone = this.a.getTimeZone();
            try {
                try {
                    time = new Time(this.a.parse(Z).getTime());
                } catch (ParseException e2) {
                    throw new v("Failed parsing '" + Z + "' as SQL Time; at path " + aVar.s(true), e2);
                }
            } finally {
                this.a.setTimeZone(timeZone);
            }
        }
        return time;
    }

    @Override // com.google.gson.c0
    public final void c(zc.b bVar, Object obj) {
        String format;
        Time time = (Time) obj;
        if (time == null) {
            bVar.t();
            return;
        }
        synchronized (this) {
            format = this.a.format((Date) time);
        }
        bVar.X(format);
    }

    private d() {
        this.a = new SimpleDateFormat("hh:mm:ss a");
    }
}
