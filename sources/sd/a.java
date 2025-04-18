package sd;

import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class a extends b {

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f24991c;

    /* renamed from: d, reason: collision with root package name */
    public final JSONObject f24992d;

    /* renamed from: e, reason: collision with root package name */
    public final long f24993e;

    public a(qa.a aVar, HashSet hashSet, JSONObject jSONObject, long j3) {
        super(aVar);
        this.f24991c = new HashSet(hashSet);
        this.f24992d = jSONObject;
        this.f24993e = j3;
    }
}
