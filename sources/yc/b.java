package yc;

import com.google.gson.c0;
import com.google.gson.v;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

/* loaded from: classes3.dex */
public final class b extends c0 {

    /* renamed from: b, reason: collision with root package name */
    public static final a f28161b = new a();
    public final SimpleDateFormat a;

    public /* synthetic */ b(int i10) {
        this();
    }

    @Override // com.google.gson.c0
    public final Object b(zc.a aVar) {
        Date date;
        if (aVar.b0() == 9) {
            aVar.X();
            return null;
        }
        String Z = aVar.Z();
        synchronized (this) {
            TimeZone timeZone = this.a.getTimeZone();
            try {
                try {
                    date = new Date(this.a.parse(Z).getTime());
                } catch (ParseException e2) {
                    throw new v("Failed parsing '" + Z + "' as SQL Date; at path " + aVar.s(true), e2);
                }
            } finally {
                this.a.setTimeZone(timeZone);
            }
        }
        return date;
    }

    @Override // com.google.gson.c0
    public final void c(zc.b bVar, Object obj) {
        String format;
        Date date = (Date) obj;
        if (date == null) {
            bVar.t();
            return;
        }
        synchronized (this) {
            format = this.a.format((java.util.Date) date);
        }
        bVar.X(format);
    }

    private b() {
        this.a = new SimpleDateFormat("MMM d, yyyy");
    }
}
