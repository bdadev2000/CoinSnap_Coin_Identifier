package t7;

import android.content.Context;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import com.facebook.ads.AdError;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.HashMap;
import n9.h0;
import s7.e1;
import s7.r0;
import s7.v2;
import s7.w2;
import s7.x2;
import s7.z1;
import v8.z;

/* loaded from: classes3.dex */
public final class u implements c, v {
    public boolean A;
    public final Context a;

    /* renamed from: b, reason: collision with root package name */
    public final r f25336b;

    /* renamed from: c, reason: collision with root package name */
    public final PlaybackSession f25337c;

    /* renamed from: i, reason: collision with root package name */
    public String f25343i;

    /* renamed from: j, reason: collision with root package name */
    public PlaybackMetrics.Builder f25344j;

    /* renamed from: k, reason: collision with root package name */
    public int f25345k;

    /* renamed from: n, reason: collision with root package name */
    public z1 f25348n;

    /* renamed from: o, reason: collision with root package name */
    public f0.c f25349o;

    /* renamed from: p, reason: collision with root package name */
    public f0.c f25350p;

    /* renamed from: q, reason: collision with root package name */
    public f0.c f25351q;

    /* renamed from: r, reason: collision with root package name */
    public r0 f25352r;

    /* renamed from: s, reason: collision with root package name */
    public r0 f25353s;

    /* renamed from: t, reason: collision with root package name */
    public r0 f25354t;
    public boolean u;

    /* renamed from: v, reason: collision with root package name */
    public int f25355v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f25356w;

    /* renamed from: x, reason: collision with root package name */
    public int f25357x;

    /* renamed from: y, reason: collision with root package name */
    public int f25358y;

    /* renamed from: z, reason: collision with root package name */
    public int f25359z;

    /* renamed from: e, reason: collision with root package name */
    public final w2 f25339e = new w2();

    /* renamed from: f, reason: collision with root package name */
    public final v2 f25340f = new v2();

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f25342h = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f25341g = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final long f25338d = SystemClock.elapsedRealtime();

    /* renamed from: l, reason: collision with root package name */
    public int f25346l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f25347m = 0;

    public u(Context context, PlaybackSession playbackSession) {
        this.a = context.getApplicationContext();
        this.f25337c = playbackSession;
        r rVar = new r();
        this.f25336b = rVar;
        rVar.f25333d = this;
    }

    public static int c(int i10) {
        switch (h0.o(i10)) {
            case AdError.ICONVIEW_MISSING_ERROR_CODE /* 6002 */:
                return 24;
            case AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE /* 6003 */:
                return 28;
            case 6004:
                return 25;
            case 6005:
                return 26;
            default:
                return 27;
        }
    }

    public final boolean a(f0.c cVar) {
        String str;
        if (cVar != null) {
            String str2 = (String) cVar.f17517d;
            r rVar = this.f25336b;
            synchronized (rVar) {
                str = rVar.f25335f;
            }
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public final void b() {
        long longValue;
        long longValue2;
        int i10;
        PlaybackMetrics build;
        PlaybackMetrics.Builder builder = this.f25344j;
        if (builder != null && this.A) {
            builder.setAudioUnderrunCount(this.f25359z);
            this.f25344j.setVideoFramesDropped(this.f25357x);
            this.f25344j.setVideoFramesPlayed(this.f25358y);
            Long l10 = (Long) this.f25341g.get(this.f25343i);
            PlaybackMetrics.Builder builder2 = this.f25344j;
            if (l10 == null) {
                longValue = 0;
            } else {
                longValue = l10.longValue();
            }
            builder2.setNetworkTransferDurationMillis(longValue);
            Long l11 = (Long) this.f25342h.get(this.f25343i);
            PlaybackMetrics.Builder builder3 = this.f25344j;
            if (l11 == null) {
                longValue2 = 0;
            } else {
                longValue2 = l11.longValue();
            }
            builder3.setNetworkBytesRead(longValue2);
            PlaybackMetrics.Builder builder4 = this.f25344j;
            if (l11 != null && l11.longValue() > 0) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            builder4.setStreamSource(i10);
            build = this.f25344j.build();
            this.f25337c.reportPlaybackMetrics(build);
        }
        this.f25344j = null;
        this.f25343i = null;
        this.f25359z = 0;
        this.f25357x = 0;
        this.f25358y = 0;
        this.f25352r = null;
        this.f25353s = null;
        this.f25354t = null;
        this.A = false;
    }

    public final void d(x2 x2Var, z zVar) {
        int b3;
        PlaybackMetrics.Builder builder = this.f25344j;
        if (zVar == null || (b3 = x2Var.b(zVar.a)) == -1) {
            return;
        }
        v2 v2Var = this.f25340f;
        int i10 = 0;
        x2Var.f(b3, v2Var, false);
        int i11 = v2Var.f24787d;
        w2 w2Var = this.f25339e;
        x2Var.m(i11, w2Var);
        e1 e1Var = w2Var.f24841d.f24453c;
        int i12 = 2;
        if (e1Var != null) {
            int C = h0.C(e1Var.f24342b, e1Var.f24343c);
            if (C != 0) {
                if (C != 1) {
                    if (C != 2) {
                        i10 = 1;
                    } else {
                        i10 = 4;
                    }
                } else {
                    i10 = 5;
                }
            } else {
                i10 = 3;
            }
        }
        builder.setStreamType(i10);
        if (w2Var.f24852p != C.TIME_UNSET && !w2Var.f24850n && !w2Var.f24847k && !w2Var.a()) {
            builder.setMediaDurationMillis(h0.Q(w2Var.f24852p));
        }
        if (!w2Var.a()) {
            i12 = 1;
        }
        builder.setPlaybackType(i12);
        this.A = true;
    }

    public final void e(b bVar, String str) {
        PlaybackMetrics.Builder playerName;
        PlaybackMetrics.Builder playerVersion;
        z zVar = bVar.f25289d;
        if (zVar != null && zVar.a()) {
            return;
        }
        b();
        this.f25343i = str;
        t.p();
        playerName = t.b().setPlayerName("ExoPlayerLib");
        playerVersion = playerName.setPlayerVersion("2.19.0");
        this.f25344j = playerVersion;
        d(bVar.f25287b, zVar);
    }

    public final void f(b bVar, String str) {
        z zVar = bVar.f25289d;
        if ((zVar == null || !zVar.a()) && str.equals(this.f25343i)) {
            b();
        }
        this.f25341g.remove(str);
        this.f25342h.remove(str);
    }

    public final void g(int i10, long j3, r0 r0Var, int i11) {
        TrackChangeEvent.Builder timeSinceCreatedMillis;
        TrackChangeEvent build;
        int i12;
        String str;
        t.A();
        timeSinceCreatedMillis = t.d(i10).setTimeSinceCreatedMillis(j3 - this.f25338d);
        if (r0Var != null) {
            timeSinceCreatedMillis.setTrackState(1);
            if (i11 != 1) {
                i12 = 3;
                if (i11 != 2) {
                    if (i11 != 3) {
                        i12 = 1;
                    } else {
                        i12 = 4;
                    }
                }
            } else {
                i12 = 2;
            }
            timeSinceCreatedMillis.setTrackChangeReason(i12);
            String str2 = r0Var.f24722m;
            if (str2 != null) {
                timeSinceCreatedMillis.setContainerMimeType(str2);
            }
            String str3 = r0Var.f24723n;
            if (str3 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str3);
            }
            String str4 = r0Var.f24720k;
            if (str4 != null) {
                timeSinceCreatedMillis.setCodecName(str4);
            }
            int i13 = r0Var.f24719j;
            if (i13 != -1) {
                timeSinceCreatedMillis.setBitrate(i13);
            }
            int i14 = r0Var.f24728s;
            if (i14 != -1) {
                timeSinceCreatedMillis.setWidth(i14);
            }
            int i15 = r0Var.f24729t;
            if (i15 != -1) {
                timeSinceCreatedMillis.setHeight(i15);
            }
            int i16 = r0Var.A;
            if (i16 != -1) {
                timeSinceCreatedMillis.setChannelCount(i16);
            }
            int i17 = r0Var.B;
            if (i17 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i17);
            }
            String str5 = r0Var.f24714d;
            if (str5 != null) {
                int i18 = h0.a;
                String[] split = str5.split("-", -1);
                String str6 = split[0];
                if (split.length >= 2) {
                    str = split[1];
                } else {
                    str = null;
                }
                Pair create = Pair.create(str6, str);
                timeSinceCreatedMillis.setLanguage((String) create.first);
                Object obj = create.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f10 = r0Var.u;
            if (f10 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f10);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.A = true;
        PlaybackSession playbackSession = this.f25337c;
        build = timeSinceCreatedMillis.build();
        playbackSession.reportTrackChangeEvent(build);
    }
}
