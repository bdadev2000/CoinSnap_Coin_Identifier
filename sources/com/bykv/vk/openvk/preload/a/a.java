package com.bykv.vk.openvk.preload.a;

import java.io.IOException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class a extends t<Date> {
    private final Class<? extends Date> a;

    /* renamed from: b, reason: collision with root package name */
    private final List<DateFormat> f9762b;

    public a(Class<? extends Date> cls, String str) {
        ArrayList arrayList = new ArrayList();
        this.f9762b = arrayList;
        this.a = a(cls);
        Locale locale = Locale.US;
        arrayList.add(new SimpleDateFormat(str, locale));
        if (Locale.getDefault().equals(locale)) {
            return;
        }
        arrayList.add(new SimpleDateFormat(str));
    }

    @Override // com.bykv.vk.openvk.preload.a.t
    public final /* synthetic */ void a(com.bykv.vk.openvk.preload.a.d.c cVar, Date date) throws IOException {
        Date date2 = date;
        if (date2 == null) {
            cVar.e();
            return;
        }
        synchronized (this.f9762b) {
            cVar.b(this.f9762b.get(0).format(date2));
        }
    }

    public final String toString() {
        DateFormat dateFormat = this.f9762b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }

    public a(Class<? extends Date> cls, int i10, int i11) {
        ArrayList arrayList = new ArrayList();
        this.f9762b = arrayList;
        this.a = a(cls);
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i10, i11, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i10, i11));
        }
        if (com.bykv.vk.openvk.preload.a.b.e.b()) {
            arrayList.add(com.bykv.vk.openvk.preload.a.b.j.a(i10, i11));
        }
    }

    private static Class<? extends Date> a(Class<? extends Date> cls) {
        if (cls == Date.class || cls == java.sql.Date.class || cls == Timestamp.class) {
            return cls;
        }
        throw new IllegalArgumentException("Date type must be one of " + Date.class + ", " + Timestamp.class + ", or " + java.sql.Date.class + " but was " + cls);
    }

    private Date a(String str) {
        synchronized (this.f9762b) {
            Iterator<DateFormat> it = this.f9762b.iterator();
            while (it.hasNext()) {
                try {
                    return it.next().parse(str);
                } catch (ParseException unused) {
                }
            }
            try {
                return com.bykv.vk.openvk.preload.a.b.a.a.a.a(str, new ParsePosition(0));
            } catch (ParseException e2) {
                throw new r(str, e2);
            }
        }
    }

    @Override // com.bykv.vk.openvk.preload.a.t
    public final /* synthetic */ Date a(com.bykv.vk.openvk.preload.a.d.a aVar) throws IOException {
        if (aVar.f() == com.bykv.vk.openvk.preload.a.d.b.NULL) {
            aVar.k();
            return null;
        }
        Date a = a(aVar.i());
        Class<? extends Date> cls = this.a;
        if (cls == Date.class) {
            return a;
        }
        if (cls == Timestamp.class) {
            return new Timestamp(a.getTime());
        }
        if (cls == java.sql.Date.class) {
            return new java.sql.Date(a.getTime());
        }
        throw new AssertionError();
    }
}
