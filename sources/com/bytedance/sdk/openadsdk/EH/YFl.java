package com.bytedance.sdk.openadsdk.EH;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.YoT;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class YFl implements Comparable<YFl> {
    private int DSW;
    private final String Sg;
    private long pDU;
    private int tN;
    private int wN;
    private final ArrayList<Long> YFl = new ArrayList<>();
    private final ArrayList<Long> AlY = new ArrayList<>();

    /* renamed from: vc, reason: collision with root package name */
    private final ArrayList<Long> f10517vc = new ArrayList<>();
    private final ArrayList<Long> qsH = new ArrayList<>();
    private final HashMap<String, Sg> NjR = new HashMap<>();

    /* renamed from: nc, reason: collision with root package name */
    private int f10516nc = 0;
    private int eT = 0;
    private final HashMap<String, Sg> YoT = new HashMap<>();
    private int GA = 0;
    private final ArrayList<String> EH = new ArrayList<>();

    public YFl(String str) {
        this.Sg = str;
    }

    private void Sg(@NonNull JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        int i10;
        int i11;
        int i12;
        long j3;
        HashSet hashSet;
        HashSet hashSet2;
        HashSet hashSet3;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        int[] YoT = com.bytedance.sdk.openadsdk.vc.YFl.YFl().YoT();
        long j10 = ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;
        if (YoT != null) {
            int i13 = 0;
            while (i13 < YoT.length) {
                int i14 = YoT[i13];
                long j11 = elapsedRealtime - (i14 * j10);
                Iterator<String> it = this.YoT.keySet().iterator();
                long j12 = 0;
                while (it.hasNext()) {
                    String next = it.next();
                    Iterator<String> it2 = it;
                    Sg sg2 = this.YoT.get(next);
                    if (sg2 != null) {
                        long YFl = sg2.YFl(j11, elapsedRealtime);
                        j12 += YFl;
                        if (YFl <= 0 && i13 == YoT.length - 1) {
                            hashSet4.add(next);
                        }
                    }
                    it = it2;
                }
                if (j12 != 0) {
                    jSONObject.put("lp_stay_t_".concat(String.valueOf(i14)), j12);
                    hashSet2 = hashSet4;
                    hashSet3 = hashSet5;
                    long optInt = jSONObject2.optInt("lp_stay_t_".concat(String.valueOf(i14))) + j12;
                    if (optInt != 0) {
                        jSONObject2.put("lp_stay_t_".concat(String.valueOf(i14)), optInt);
                    }
                } else {
                    hashSet2 = hashSet4;
                    hashSet3 = hashSet5;
                }
                i13++;
                hashSet4 = hashSet2;
                hashSet5 = hashSet3;
                j10 = ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;
            }
        }
        HashSet hashSet6 = hashSet4;
        HashSet hashSet7 = hashSet5;
        int[] GA = com.bytedance.sdk.openadsdk.vc.YFl.YFl().GA();
        if (GA != null) {
            int i15 = 0;
            while (i15 < GA.length) {
                int i16 = GA[i15];
                long j13 = elapsedRealtime - (i16 * ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
                Iterator<String> it3 = this.NjR.keySet().iterator();
                int i17 = 0;
                long j14 = 0;
                while (it3.hasNext()) {
                    String next2 = it3.next();
                    Iterator<String> it4 = it3;
                    Sg sg3 = this.NjR.get(next2);
                    if (sg3 != null) {
                        long YFl2 = sg3.YFl(j13, elapsedRealtime);
                        j14 += YFl2;
                        if (YFl2 > 20000) {
                            i17++;
                        }
                        if (YFl2 <= 0 && i15 == GA.length - 1) {
                            hashSet = hashSet7;
                            hashSet.add(next2);
                            hashSet7 = hashSet;
                            it3 = it4;
                        }
                    }
                    hashSet = hashSet7;
                    hashSet7 = hashSet;
                    it3 = it4;
                }
                HashSet hashSet8 = hashSet7;
                if (j14 != 0) {
                    jSONObject.put("v_stay_t_".concat(String.valueOf(i16)), j14);
                    j3 = elapsedRealtime;
                    long optInt2 = jSONObject2.optInt("v_stay_t_".concat(String.valueOf(i16))) + j14;
                    if (optInt2 != 0) {
                        jSONObject2.put("v_stay_t_".concat(String.valueOf(i16)), optInt2);
                    }
                } else {
                    j3 = elapsedRealtime;
                }
                if (i17 != 0) {
                    jSONObject.put("v_20s_play_c_".concat(String.valueOf(i16)), i17);
                    int optInt3 = jSONObject2.optInt("v_20s_play_c_".concat(String.valueOf(i16))) + i17;
                    if (optInt3 != 0) {
                        jSONObject2.put("v_20s_play_c_".concat(String.valueOf(i16)), optInt3);
                    }
                }
                i15++;
                hashSet7 = hashSet8;
                elapsedRealtime = j3;
            }
        }
        HashSet hashSet9 = hashSet7;
        if (!hashSet6.isEmpty()) {
            Iterator it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                this.YoT.remove((String) it5.next());
            }
        }
        if (!hashSet9.isEmpty()) {
            Iterator it6 = hashSet9.iterator();
            while (it6.hasNext()) {
                this.NjR.remove((String) it6.next());
            }
        }
        if (com.bytedance.sdk.openadsdk.vc.YFl.YFl().EH() && (i12 = this.f10516nc) != 0) {
            jSONObject.put("v_stay_t_s", i12);
            int optInt4 = jSONObject2.optInt("v_stay_t_s") + this.f10516nc;
            if (optInt4 != 0) {
                jSONObject2.put("v_stay_t_s", optInt4);
            }
        }
        if (com.bytedance.sdk.openadsdk.vc.YFl.YFl().pDU() && (i11 = this.GA) != 0) {
            jSONObject.put("lp_stay_t_s", i11);
            int optInt5 = jSONObject2.optInt("lp_stay_t_s") + this.GA;
            if (optInt5 != 0) {
                jSONObject2.put("lp_stay_t_s", optInt5);
            }
        }
        if (!com.bytedance.sdk.openadsdk.vc.YFl.YFl().lG() || (i10 = this.eT) == 0) {
            return;
        }
        jSONObject.put("v_30p_play_c_s", i10);
        int optInt6 = jSONObject2.optInt("v_30p_play_c_s") + this.eT;
        if (optInt6 != 0) {
            jSONObject2.put("v_30p_play_c_s", optInt6);
        }
    }

    public void YFl(@NonNull String str, @Nullable String str2) {
        Sg sg2;
        Sg sg3;
        Sg sg4;
        Sg sg5;
        Sg sg6;
        Sg sg7;
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1908685858:
                if (str.equals("landingContinue")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1769688545:
                if (str.equals("landingPause")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1766371189:
                if (str.equals("landingStart")) {
                    c10 = 2;
                    break;
                }
                break;
            case -1643912491:
                if (str.equals("feed_over")) {
                    c10 = 3;
                    break;
                }
                break;
            case -1643892427:
                if (str.equals("feed_play")) {
                    c10 = 4;
                    break;
                }
                break;
            case 3529469:
                if (str.equals("show")) {
                    c10 = 5;
                    break;
                }
                break;
            case 94750088:
                if (str.equals(CampaignEx.JSON_NATIVE_VIDEO_CLICK)) {
                    c10 = 6;
                    break;
                }
                break;
            case 533457448:
                if (str.equals("feed_continue")) {
                    c10 = 7;
                    break;
                }
                break;
            case 566194974:
                if (str.equals("feed_break")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 578633749:
                if (str.equals("feed_pause")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 695109002:
                if (str.equals("landingFinish")) {
                    c10 = '\n';
                    break;
                }
                break;
            case 702698279:
                if (str.equals("videoPercent30")) {
                    c10 = 11;
                    break;
                }
                break;
            case 1338624943:
                if (str.equals("videoForceBreak")) {
                    c10 = '\f';
                    break;
                }
                break;
            case 1671642405:
                if (str.equals("dislike")) {
                    c10 = '\r';
                    break;
                }
                break;
            case 1912965437:
                if (str.equals("play_error")) {
                    c10 = 14;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                if (TextUtils.isEmpty(str2) || (sg2 = this.YoT.get(str2)) == null) {
                    return;
                }
                sg2.AlY(SystemClock.elapsedRealtime());
                return;
            case 1:
                if (TextUtils.isEmpty(str2) || (sg3 = this.YoT.get(str2)) == null) {
                    return;
                }
                sg3.tN(SystemClock.elapsedRealtime());
                return;
            case 2:
                if (TextUtils.isEmpty(str2) || this.YoT.get(str2) != null) {
                    return;
                }
                Sg sg8 = new Sg();
                this.YoT.put(str2, sg8);
                sg8.YFl(SystemClock.elapsedRealtime());
                return;
            case 3:
            case '\b':
            case '\f':
            case 14:
                if (TextUtils.isEmpty(str2) || (sg4 = this.NjR.get(str2)) == null || sg4.YFl() == Sg.wN) {
                    return;
                }
                sg4.Sg(SystemClock.elapsedRealtime());
                if (com.bytedance.sdk.openadsdk.vc.YFl.YFl().EH()) {
                    this.f10516nc = (int) (sg4.YFl(this.pDU, SystemClock.elapsedRealtime()) + this.f10516nc);
                    return;
                }
                return;
            case 4:
                this.f10517vc.add(Long.valueOf(SystemClock.elapsedRealtime()));
                if (com.bytedance.sdk.openadsdk.vc.YFl.YFl().qsH()) {
                    this.DSW++;
                }
                if (TextUtils.isEmpty(str2) || this.NjR.get(str2) != null) {
                    return;
                }
                Sg sg9 = new Sg();
                this.NjR.put(str2, sg9);
                sg9.YFl(SystemClock.elapsedRealtime());
                return;
            case 5:
                this.YFl.add(Long.valueOf(SystemClock.elapsedRealtime()));
                if (com.bytedance.sdk.openadsdk.vc.YFl.YFl().vc()) {
                    this.tN++;
                    return;
                }
                return;
            case 6:
                if (this.EH.contains(str2)) {
                    return;
                }
                if (this.EH.size() > 50) {
                    this.EH.subList(0, 25).clear();
                }
                this.EH.add(str2);
                this.AlY.add(Long.valueOf(SystemClock.elapsedRealtime()));
                if (com.bytedance.sdk.openadsdk.vc.YFl.YFl().DSW()) {
                    this.wN++;
                    return;
                }
                return;
            case 7:
                if (TextUtils.isEmpty(str2) || (sg5 = this.NjR.get(str2)) == null) {
                    return;
                }
                sg5.AlY(SystemClock.elapsedRealtime());
                return;
            case '\t':
                if (TextUtils.isEmpty(str2) || (sg6 = this.NjR.get(str2)) == null) {
                    return;
                }
                sg6.tN(SystemClock.elapsedRealtime());
                return;
            case '\n':
                if (TextUtils.isEmpty(str2) || (sg7 = this.YoT.get(str2)) == null || sg7.YFl() == Sg.wN) {
                    return;
                }
                sg7.Sg(SystemClock.elapsedRealtime());
                if (com.bytedance.sdk.openadsdk.vc.YFl.YFl().pDU()) {
                    this.GA = (int) (sg7.YFl(this.pDU, SystemClock.elapsedRealtime()) + this.GA);
                    return;
                }
                return;
            case 11:
                if (com.bytedance.sdk.openadsdk.vc.YFl.YFl().lG()) {
                    this.eT++;
                    return;
                }
                return;
            case '\r':
                this.qsH.add(Long.valueOf(SystemClock.elapsedRealtime()));
                return;
            default:
                return;
        }
    }

    public String Sg() {
        return this.Sg;
    }

    public JSONObject YFl(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            YFl(jSONObject2, jSONObject);
            Sg(jSONObject2, jSONObject);
        } catch (Throwable th2) {
            YoT.Sg(th2.getMessage());
        }
        return jSONObject2;
    }

    private void YFl(String str, JSONObject jSONObject, ArrayList<Long> arrayList, int[] iArr, long j3, JSONObject jSONObject2) throws JSONException {
        int size = arrayList.size() - 1;
        int i10 = 0;
        for (int i11 : iArr) {
            long j10 = j3 - (i11 * ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
            while (size >= 0 && arrayList.get(size).longValue() >= j10) {
                i10++;
                size--;
            }
            if (i10 != 0) {
                jSONObject.put(str + i11, i10);
                int optInt = jSONObject2.optInt(str + i11) + i10;
                if (optInt != 0) {
                    jSONObject2.put(str + i11, optInt);
                }
            }
        }
        while (size >= 0) {
            arrayList.remove(0);
            size--;
        }
    }

    private void YFl(@NonNull JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        int i10;
        int i11;
        int i12;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        YFl("show_c_", jSONObject, this.YFl, com.bytedance.sdk.openadsdk.vc.YFl.YFl().NjR(), elapsedRealtime, jSONObject2);
        YFl("click_c_", jSONObject, this.AlY, com.bytedance.sdk.openadsdk.vc.YFl.YFl().nc(), elapsedRealtime, jSONObject2);
        YFl("v_play_c_", jSONObject, this.f10517vc, com.bytedance.sdk.openadsdk.vc.YFl.YFl().eT(), elapsedRealtime, jSONObject2);
        YFl("dislike_c_", jSONObject, this.qsH, com.bytedance.sdk.openadsdk.vc.YFl.YFl().rkt(), elapsedRealtime, jSONObject2);
        if (com.bytedance.sdk.openadsdk.vc.YFl.YFl().vc() && (i12 = this.tN) != 0) {
            jSONObject.put("show_c_s", i12);
            int optInt = jSONObject2.optInt("show_c_s") + this.tN;
            if (optInt != 0) {
                jSONObject2.put("show_c_s", optInt);
            }
        }
        if (com.bytedance.sdk.openadsdk.vc.YFl.YFl().DSW() && (i11 = this.wN) != 0) {
            jSONObject.put("click_c_s", i11);
            int optInt2 = jSONObject2.optInt("click_c_s") + this.wN;
            if (optInt2 != 0) {
                jSONObject2.put("click_c_s", optInt2);
            }
        }
        if (!com.bytedance.sdk.openadsdk.vc.YFl.YFl().qsH() || (i10 = this.DSW) == 0) {
            return;
        }
        jSONObject.put("v_play_c_s", i10);
        int optInt3 = jSONObject2.optInt("v_play_c_s") + this.DSW;
        if (optInt3 != 0) {
            jSONObject2.put("v_play_c_s", optInt3);
        }
    }

    public void YFl() {
        this.pDU = SystemClock.elapsedRealtime();
        this.eT = 0;
        this.wN = 0;
        this.tN = 0;
        this.GA = 0;
        this.f10516nc = 0;
        this.DSW = 0;
    }

    @Override // java.lang.Comparable
    /* renamed from: YFl, reason: merged with bridge method [inline-methods] */
    public int compareTo(YFl yFl) {
        return yFl.tN - this.tN;
    }
}
