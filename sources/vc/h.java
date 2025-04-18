package vc;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes3.dex */
public final class h extends com.google.gson.c0 {

    /* renamed from: c, reason: collision with root package name */
    public static final e f26443c = new e();
    public final g a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f26444b;

    public h() {
        boolean z10;
        f fVar = g.a;
        ArrayList arrayList = new ArrayList();
        this.f26444b = arrayList;
        this.a = fVar;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (uc.g.a >= 9) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            arrayList.add(new SimpleDateFormat(kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.m("MMM d, yyyy", " ", "h:mm:ss a"), locale));
        }
    }

    @Override // com.google.gson.c0
    public final Object b(zc.a aVar) {
        Date b3;
        if (aVar.b0() == 9) {
            aVar.X();
            return null;
        }
        String Z = aVar.Z();
        synchronized (this.f26444b) {
            Iterator it = this.f26444b.iterator();
            while (true) {
                if (it.hasNext()) {
                    DateFormat dateFormat = (DateFormat) it.next();
                    TimeZone timeZone = dateFormat.getTimeZone();
                    try {
                        b3 = dateFormat.parse(Z);
                        dateFormat.setTimeZone(timeZone);
                        break;
                    } catch (ParseException unused) {
                        dateFormat.setTimeZone(timeZone);
                    } catch (Throwable th2) {
                        dateFormat.setTimeZone(timeZone);
                        throw th2;
                    }
                } else {
                    try {
                        b3 = wc.a.b(Z, new ParsePosition(0));
                        break;
                    } catch (ParseException e2) {
                        StringBuilder o10 = a4.j.o("Failed parsing '", Z, "' as Date; at path ");
                        o10.append(aVar.s(true));
                        throw new com.google.gson.v(o10.toString(), e2);
                    }
                }
            }
        }
        return this.a.a(b3);
    }

    @Override // com.google.gson.c0
    public final void c(zc.b bVar, Object obj) {
        String format;
        Date date = (Date) obj;
        if (date == null) {
            bVar.t();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.f26444b.get(0);
        synchronized (this.f26444b) {
            format = dateFormat.format(date);
        }
        bVar.X(format);
    }

    public final String toString() {
        DateFormat dateFormat = (DateFormat) this.f26444b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }
}
