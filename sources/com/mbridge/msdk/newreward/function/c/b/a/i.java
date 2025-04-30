package com.mbridge.msdk.newreward.function.c.b.a;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.newreward.function.common.MBridgeGlobalCommon;
import com.mbridge.msdk.newreward.function.d.c.n;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.RewardInfo;
import com.mbridge.msdk.reward.player.MBRewardVideoActivity;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public final class i implements com.mbridge.msdk.newreward.function.c.b.b {

    /* renamed from: a, reason: collision with root package name */
    com.mbridge.msdk.newreward.a.e f17081a;

    /* loaded from: classes3.dex */
    public static class a implements com.mbridge.msdk.video.bt.module.b.h {

        /* renamed from: a, reason: collision with root package name */
        private final com.mbridge.msdk.newreward.function.d.a.b f17082a;
        private final com.mbridge.msdk.newreward.a.e b;

        public a(com.mbridge.msdk.newreward.function.d.a.b bVar, com.mbridge.msdk.newreward.a.e eVar) {
            this.f17082a = bVar;
            this.b = eVar;
        }

        @Override // com.mbridge.msdk.video.bt.module.b.h
        public final void a(int i9, String str, String str2) {
        }

        @Override // com.mbridge.msdk.video.bt.module.b.h
        public final void b(String str, String str2) {
            try {
                com.mbridge.msdk.foundation.d.b.a().a(str2 + "_2", 2);
                this.b.D().onEndcardShow(new MBridgeIds(this.b.w(), this.b.A()));
            } catch (Exception e4) {
                ad.b("DefaultShowRewardListener", "onEndcardShow", e4);
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.b.h
        public final void a(com.mbridge.msdk.foundation.same.report.d.b bVar) {
            try {
                com.mbridge.msdk.newreward.function.e.c.a().b().a(this.f17082a.a(), this.f17082a.b(), this.f17082a.c(), this.f17082a.e(), 6);
                com.mbridge.msdk.foundation.same.report.d.c.a().a("2000130", bVar);
                this.b.D().onAdShow(new MBridgeIds(this.b.w(), this.b.A()));
            } catch (Exception e4) {
                ad.b("DefaultShowRewardListener", "onAdShow", e4);
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.b.h
        public final void a(com.mbridge.msdk.foundation.same.report.d.b bVar, boolean z8, com.mbridge.msdk.videocommon.b.c cVar) {
            try {
                com.mbridge.msdk.foundation.same.report.d.c.a().a("2000152", bVar);
                this.b.D().onAdClose(new MBridgeIds(this.b.w(), this.b.A()), new RewardInfo(z8, cVar.a(), String.valueOf(cVar.b())));
            } catch (Exception e4) {
                ad.b("DefaultShowRewardListener", "onAdClose", e4);
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.b.h
        public final void a(com.mbridge.msdk.foundation.same.report.d.b bVar, String str) {
            try {
                com.mbridge.msdk.newreward.function.e.c.a().b().a(this.f17082a.a(), this.f17082a.b(), this.f17082a.c(), this.f17082a.e(), 7);
                com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                dVar.a("reason", str);
                bVar.a("2000131", dVar);
                com.mbridge.msdk.foundation.same.report.d.c.a().a("2000131", bVar);
                this.b.D().onShowFail(new MBridgeIds(this.b.w(), this.b.A()), str);
            } catch (Exception e4) {
                ad.b("DefaultShowRewardListener", "onShowFail", e4);
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.b.h
        public final void a(boolean z8, String str, String str2) {
            try {
                this.b.D().onVideoAdClicked(new MBridgeIds(this.b.w(), this.b.A()));
            } catch (Exception e4) {
                ad.b("DefaultShowRewardListener", "onVideoAdClicked", e4);
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.b.h
        public final void a(String str, String str2) {
            try {
                this.b.D().onVideoComplete(new MBridgeIds(this.b.w(), this.b.A()));
            } catch (Exception e4) {
                ad.b("DefaultShowRewardListener", "onVideoComplete", e4);
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.b.h
        public final void a(boolean z8, int i9) {
            try {
                this.b.D().onAdCloseWithIVReward(new MBridgeIds(this.b.w(), this.b.A()), z8, i9);
            } catch (Exception e4) {
                ad.b("DefaultShowRewardListener", "onAdCloseWithIVReward", e4);
            }
        }
    }

    @Override // com.mbridge.msdk.newreward.function.c.b.b
    public final void a(Object obj) {
        Intent intent;
        com.mbridge.msdk.newreward.a.e eVar = (com.mbridge.msdk.newreward.a.e) ((com.mbridge.msdk.newreward.function.c.b) obj).b();
        this.f17081a = eVar;
        if (eVar != null) {
            try {
                com.mbridge.msdk.newreward.function.d.a.b b = eVar.x().b();
                try {
                    Context c9 = com.mbridge.msdk.foundation.controller.c.m().c();
                    String str = MBRewardVideoActivity.INTENT_UNITID;
                    intent = new Intent(c9, (Class<?>) MBRewardVideoActivity.class);
                } catch (Exception unused) {
                    intent = null;
                }
                intent.putExtra(CampaignEx.JSON_KEY_CAMPAIGN_UNITID, this.f17081a.A());
                intent.putExtra(MBridgeConstans.PLACEMENT_ID, this.f17081a.w());
                intent.putExtra(CampaignEx.JSON_NATIVE_VIDEO_MUTE, this.f17081a.H());
                boolean z8 = false;
                if (this.f17081a.p() == 287) {
                    z8 = true;
                }
                intent.putExtra("isIV", z8);
                intent.putExtra("isBid", TextUtils.isEmpty(this.f17081a.C()));
                if (z8) {
                    intent.putExtra("ivRewardMode", this.f17081a.k());
                    intent.putExtra("ivRewardValueType", this.f17081a.j());
                    intent.putExtra("ivRewardValue", this.f17081a.k());
                }
                intent.putExtra("isBigOffer", !TextUtils.isEmpty(b.z()));
                intent.putExtra("is_refactor", true);
                List<com.mbridge.msdk.newreward.function.d.a.a> s5 = b.s();
                CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
                CopyOnWriteArrayList<com.mbridge.msdk.videocommon.download.a> copyOnWriteArrayList2 = new CopyOnWriteArrayList<>();
                for (com.mbridge.msdk.newreward.function.d.a.a aVar : s5) {
                    CampaignEx g9 = aVar.g();
                    g9.setReady_rate(100);
                    copyOnWriteArrayList.add(g9);
                    com.mbridge.msdk.videocommon.download.a aVar2 = new com.mbridge.msdk.videocommon.download.a(com.mbridge.msdk.foundation.controller.c.m().c(), g9, this.f17081a.A(), 1);
                    aVar2.d(this.f17081a.p());
                    aVar2.d(g9.getVideoUrlEncode());
                    n d2 = aVar.d();
                    if (d2 != null) {
                        aVar2.c(d2.f().getPath());
                    }
                    copyOnWriteArrayList2.add(aVar2);
                }
                com.mbridge.msdk.videocommon.download.b.getInstance().a(this.f17081a.A(), copyOnWriteArrayList);
                com.mbridge.msdk.videocommon.download.b.getInstance().b(this.f17081a.A(), copyOnWriteArrayList2);
                intent.addFlags(268435456);
                MBridgeGlobalCommon.showRewardListener = new a(b, this.f17081a);
                com.mbridge.msdk.foundation.controller.c.m().c().startActivity(intent);
            } catch (Exception e4) {
                ad.b("ShowReceiver", "show", e4);
            }
        }
    }
}
