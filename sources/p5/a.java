package p5;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a {
    public int a;

    /* renamed from: b, reason: collision with root package name */
    public int f23457b;

    /* renamed from: c, reason: collision with root package name */
    public long f23458c;

    /* renamed from: d, reason: collision with root package name */
    public double f23459d;

    /* renamed from: e, reason: collision with root package name */
    public String f23460e;

    /* renamed from: f, reason: collision with root package name */
    public String f23461f;

    /* renamed from: g, reason: collision with root package name */
    public String f23462g;

    /* renamed from: h, reason: collision with root package name */
    public String f23463h;

    /* renamed from: i, reason: collision with root package name */
    public String f23464i;

    /* renamed from: j, reason: collision with root package name */
    public String f23465j;

    /* renamed from: k, reason: collision with root package name */
    public int f23466k;

    /* renamed from: l, reason: collision with root package name */
    public int f23467l;

    /* renamed from: m, reason: collision with root package name */
    public int f23468m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f23469n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f23470o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f23471p = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f23472q = 307200;

    /* renamed from: r, reason: collision with root package name */
    public int f23473r = 1;

    public final int a() {
        if (this.f23472q < 0) {
            this.f23472q = 307200;
        }
        long j3 = this.f23472q;
        long j10 = this.f23458c;
        if (j3 > j10) {
            this.f23472q = (int) j10;
        }
        return this.f23472q;
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cover_height", this.a);
            jSONObject.put("cover_url", this.f23461f);
            jSONObject.put("cover_width", this.f23457b);
            jSONObject.put(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD, this.f23463h);
            jSONObject.put("file_hash", c());
            jSONObject.put("resolution", this.f23460e);
            jSONObject.put("size", this.f23458c);
            jSONObject.put("video_duration", this.f23459d);
            jSONObject.put(CampaignEx.JSON_KEY_VIDEO_URL, this.f23462g);
            jSONObject.put("playable_download_url", this.f23464i);
            jSONObject.put("if_playable_loading_show", this.f23468m);
            jSONObject.put("remove_loading_page_type", this.f23469n);
            jSONObject.put("fallback_endcard_judge", this.f23466k);
            jSONObject.put("video_preload_size", a());
            jSONObject.put("reward_video_cached_type", this.f23470o);
            jSONObject.put("execute_cached_type", this.f23471p);
            jSONObject.put("endcard_render", this.f23467l);
            jSONObject.put("replay_time", this.f23473r);
            jSONObject.put("play_speed_ratio", -1.0f);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public final String c() {
        if (TextUtils.isEmpty(this.f23465j)) {
            this.f23465j = m5.a.a(this.f23462g);
        }
        return this.f23465j;
    }
}
