package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new r8.b(12);

    /* renamed from: b, reason: collision with root package name */
    public final n f11666b;

    /* renamed from: c, reason: collision with root package name */
    public final n f11667c;

    /* renamed from: d, reason: collision with root package name */
    public final b f11668d;

    /* renamed from: f, reason: collision with root package name */
    public final n f11669f;

    /* renamed from: g, reason: collision with root package name */
    public final int f11670g;

    /* renamed from: h, reason: collision with root package name */
    public final int f11671h;

    /* renamed from: i, reason: collision with root package name */
    public final int f11672i;

    public c(n nVar, n nVar2, b bVar, n nVar3, int i10) {
        Objects.requireNonNull(nVar, "start cannot be null");
        Objects.requireNonNull(nVar2, "end cannot be null");
        Objects.requireNonNull(bVar, "validator cannot be null");
        this.f11666b = nVar;
        this.f11667c = nVar2;
        this.f11669f = nVar3;
        this.f11670g = i10;
        this.f11668d = bVar;
        Calendar calendar = nVar.f11723b;
        if (nVar3 != null && calendar.compareTo(nVar3.f11723b) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (nVar3 != null && nVar3.f11723b.compareTo(nVar2.f11723b) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i10 >= 0 && i10 <= u.d(null).getMaximum(7)) {
            if (calendar instanceof GregorianCalendar) {
                int i11 = nVar2.f11725d;
                int i12 = nVar.f11725d;
                this.f11672i = (nVar2.f11724c - nVar.f11724c) + ((i11 - i12) * 12) + 1;
                this.f11671h = (i11 - i12) + 1;
                return;
            }
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        throw new IllegalArgumentException("firstDayOfWeek is not valid");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f11666b.equals(cVar.f11666b) && this.f11667c.equals(cVar.f11667c) && Objects.equals(this.f11669f, cVar.f11669f) && this.f11670g == cVar.f11670g && this.f11668d.equals(cVar.f11668d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11666b, this.f11667c, this.f11669f, Integer.valueOf(this.f11670g), this.f11668d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f11666b, 0);
        parcel.writeParcelable(this.f11667c, 0);
        parcel.writeParcelable(this.f11669f, 0);
        parcel.writeParcelable(this.f11668d, 0);
        parcel.writeInt(this.f11670g);
    }
}
