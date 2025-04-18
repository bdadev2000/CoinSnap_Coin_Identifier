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

/* loaded from: classes4.dex */
public final class i implements com.mbridge.msdk.newreward.function.c.b.b {
    com.mbridge.msdk.newreward.a.e a;

    /* loaded from: classes4.dex */
    public static class a implements com.mbridge.msdk.video.bt.module.b.h {
        private final com.mbridge.msdk.newreward.function.d.a.b a;

        /* renamed from: b, reason: collision with root package name */
        private final com.mbridge.msdk.newreward.a.e f14471b;

        public a(com.mbridge.msdk.newreward.function.d.a.b bVar, com.mbridge.msdk.newreward.a.e eVar) {
            this.a = bVar;
            this.f14471b = eVar;
        }

        @Override // com.mbridge.msdk.video.bt.module.b.h
        public final void a(int i10, String str, String str2) {
        }

        @Override // com.mbridge.msdk.video.bt.module.b.h
        public final void b(String str, String str2) {
            try {
                com.mbridge.msdk.foundation.d.b.a().a(str2 + "_2", 2);
                this.f14471b.D().onEndcardShow(new MBridgeIds(this.f14471b.w(), this.f14471b.A()));
            } catch (Exception e2) {
                ad.b("DefaultShowRewardListener", "onEndcardShow", e2);
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.b.h
        public final void a(com.mbridge.msdk.foundation.same.report.d.b bVar) {
            try {
                com.mbridge.msdk.newreward.function.e.c.a().b().a(this.a.a(), this.a.b(), this.a.c(), this.a.e(), 6);
                com.mbridge.msdk.foundation.same.report.d.c.a().a("2000130", bVar);
                this.f14471b.D().onAdShow(new MBridgeIds(this.f14471b.w(), this.f14471b.A()));
            } catch (Exception e2) {
                ad.b("DefaultShowRewardListener", "onAdShow", e2);
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.b.h
        public final void a(com.mbridge.msdk.foundation.same.report.d.b bVar, boolean z10, com.mbridge.msdk.videocommon.b.c cVar) {
            try {
                com.mbridge.msdk.foundation.same.report.d.c.a().a("2000152", bVar);
                this.f14471b.D().onAdClose(new MBridgeIds(this.f14471b.w(), this.f14471b.A()), new RewardInfo(z10, cVar.a(), String.valueOf(cVar.b())));
            } catch (Exception e2) {
                ad.b("DefaultShowRewardListener", "onAdClose", e2);
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.b.h
        public final void a(com.mbridge.msdk.foundation.same.report.d.b bVar, String str) {
            try {
                com.mbridge.msdk.newreward.function.e.c.a().b().a(this.a.a(), this.a.b(), this.a.c(), this.a.e(), 7);
                com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                dVar.a("reason", str);
                bVar.a("2000131", dVar);
                com.mbridge.msdk.foundation.same.report.d.c.a().a("2000131", bVar);
                this.f14471b.D().onShowFail(new MBridgeIds(this.f14471b.w(), this.f14471b.A()), str);
            } catch (Exception e2) {
                ad.b("DefaultShowRewardListener", "onShowFail", e2);
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.b.h
        public final void a(boolean z10, String str, String str2) {
            try {
                this.f14471b.D().onVideoAdClicked(new MBridgeIds(this.f14471b.w(), this.f14471b.A()));
            } catch (Exception e2) {
                ad.b("DefaultShowRewardListener", "onVideoAdClicked", e2);
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.b.h
        public final void a(String str, String str2) {
            try {
                this.f14471b.D().onVideoComplete(new MBridgeIds(this.f14471b.w(), this.f14471b.A()));
            } catch (Exception e2) {
                ad.b("DefaultShowRewardListener", "onVideoComplete", e2);
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.b.h
        public final void a(boolean z10, int i10) {
            try {
                this.f14471b.D().onAdCloseWithIVReward(new MBridgeIds(this.f14471b.w(), this.f14471b.A()), z10, i10);
            } catch (Exception e2) {
                ad.b("DefaultShowRewardListener", "onAdCloseWithIVReward", e2);
            }
        }
    }

    @Override // com.mbridge.msdk.newreward.function.c.b.b
    public final void a(Object obj) {
        Intent intent;
        boolean z10;
        com.mbridge.msdk.newreward.a.e eVar = (com.mbridge.msdk.newreward.a.e) ((com.mbridge.msdk.newreward.function.c.b) obj).b();
        this.a = eVar;
        if (eVar != null) {
            try {
                com.mbridge.msdk.newreward.function.d.a.b b3 = eVar.x().b();
                try {
                    Context c10 = com.mbridge.msdk.foundation.controller.c.m().c();
                    String str = MBRewardVideoActivity.INTENT_UNITID;
                    intent = new Intent(c10, (Class<?>) MBRewardVideoActivity.class);
                } catch (Exception unused) {
                    intent = null;
                }
                intent.putExtra(CampaignEx.JSON_KEY_CAMPAIGN_UNITID, this.a.A());
                intent.putExtra(MBridgeConstans.PLACEMENT_ID, this.a.w());
                intent.putExtra(CampaignEx.JSON_NATIVE_VIDEO_MUTE, this.a.H());
                boolean z11 = false;
                if (this.a.p() == 287) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                intent.putExtra("isIV", z10);
                intent.putExtra("isBid", TextUtils.isEmpty(this.a.C()));
                if (z10) {
                    intent.putExtra("ivRewardMode", this.a.k());
                    intent.putExtra("ivRewardValueType", this.a.j());
                    intent.putExtra("ivRewardValue", this.a.k());
                }
                if (!TextUtils.isEmpty(b3.z())) {
                    z11 = true;
                }
                intent.putExtra("isBigOffer", z11);
                intent.putExtra("is_refactor", true);
                List<com.mbridge.msdk.newreward.function.d.a.a> s5 = b3.s();
                CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
                CopyOnWriteArrayList<com.mbridge.msdk.videocommon.download.a> copyOnWriteArrayList2 = new CopyOnWriteArrayList<>();
                for (com.mbridge.msdk.newreward.function.d.a.a aVar : s5) {
                    CampaignEx g10 = aVar.g();
                    g10.setReady_rate(100);
                    copyOnWriteArrayList.add(g10);
                    com.mbridge.msdk.videocommon.download.a aVar2 = new com.mbridge.msdk.videocommon.download.a(com.mbridge.msdk.foundation.controller.c.m().c(), g10, this.a.A(), 1);
                    aVar2.d(this.a.p());
                    aVar2.d(g10.getVideoUrlEncode());
                    n d10 = aVar.d();
                    if (d10 != null) {
                        aVar2.c(d10.f().getPath());
                    }
                    copyOnWriteArrayList2.add(aVar2);
                }
                com.mbridge.msdk.videocommon.download.b.getInstance().a(this.a.A(), copyOnWriteArrayList);
                com.mbridge.msdk.videocommon.download.b.getInstance().b(this.a.A(), copyOnWriteArrayList2);
                intent.addFlags(268435456);
                MBridgeGlobalCommon.showRewardListener = new a(b3, this.a);
                com.mbridge.msdk.foundation.controller.c.m().c().startActivity(intent);
            } catch (Exception e2) {
                ad.b("ShowReceiver", "show", e2);
            }
        }
    }
}
