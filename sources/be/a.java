package be;

import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class a extends b {

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f2424c;

    /* renamed from: d, reason: collision with root package name */
    public final JSONObject f2425d;

    /* renamed from: e, reason: collision with root package name */
    public final long f2426e;

    public a(qa.a aVar, HashSet hashSet, JSONObject jSONObject, long j3) {
        super(aVar);
        this.f2424c = new HashSet(hashSet);
        this.f2425d = jSONObject;
        this.f2426e = j3;
    }
}
