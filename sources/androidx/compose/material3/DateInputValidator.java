package androidx.compose.material3;

import androidx.compose.material3.internal.DateInputFormat;
import androidx.compose.runtime.Stable;
import w0.g;

@Stable
/* loaded from: classes4.dex */
public final class DateInputValidator {

    /* renamed from: a, reason: collision with root package name */
    public final g f8695a;

    /* renamed from: b, reason: collision with root package name */
    public final SelectableDates f8696b;

    /* renamed from: c, reason: collision with root package name */
    public final DateInputFormat f8697c;
    public final DatePickerFormatter d;
    public final String e;

    /* renamed from: f, reason: collision with root package name */
    public final String f8698f;

    /* renamed from: g, reason: collision with root package name */
    public final String f8699g;

    /* renamed from: h, reason: collision with root package name */
    public Long f8700h = null;

    /* renamed from: i, reason: collision with root package name */
    public Long f8701i = null;

    public DateInputValidator(g gVar, SelectableDates selectableDates, DateInputFormat dateInputFormat, DatePickerFormatter datePickerFormatter, String str, String str2, String str3, String str4) {
        this.f8695a = gVar;
        this.f8696b = selectableDates;
        this.f8697c = dateInputFormat;
        this.d = datePickerFormatter;
        this.e = str;
        this.f8698f = str2;
        this.f8699g = str4;
    }
}
