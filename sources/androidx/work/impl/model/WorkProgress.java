package androidx.work.impl.model;

import androidx.annotation.RestrictTo;
import androidx.room.Entity;
import androidx.work.Data;

@Entity
@RestrictTo
/* loaded from: classes.dex */
public class WorkProgress {

    /* renamed from: a, reason: collision with root package name */
    public final String f22140a;

    /* renamed from: b, reason: collision with root package name */
    public final Data f22141b;

    public WorkProgress(String str, Data data) {
        this.f22140a = str;
        this.f22141b = data;
    }
}
