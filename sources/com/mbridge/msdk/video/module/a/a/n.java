package com.mbridge.msdk.video.module.a.a;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.af;
import com.mbridge.msdk.video.module.MBridgeVideoView;
import com.mbridge.msdk.video.signal.factory.IJSFactory;

/* loaded from: classes3.dex */
public final class n extends o {
    private IJSFactory l;
    private int m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f19044n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f19045o;

    /* renamed from: p, reason: collision with root package name */
    private int f19046p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f19047q;

    /* renamed from: r, reason: collision with root package name */
    private MBridgeVideoView.a f19048r;

    public n(IJSFactory iJSFactory, CampaignEx campaignEx, com.mbridge.msdk.videocommon.b.c cVar, com.mbridge.msdk.videocommon.download.a aVar, String str, String str2, int i9, int i10, com.mbridge.msdk.video.module.a.a aVar2, int i11, boolean z8, int i12) {
        super(campaignEx, cVar, aVar, str, str2, aVar2, i11, z8);
        boolean z9;
        this.f19044n = false;
        this.f19045o = false;
        this.f19047q = false;
        this.l = iJSFactory;
        this.m = i9;
        if (i10 == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f19044n = z9;
        this.f19046p = i12;
        if (iJSFactory == null) {
            this.f19019a = false;
        }
    }

    @Override // com.mbridge.msdk.video.module.a.a.o, com.mbridge.msdk.video.module.a.a.k, com.mbridge.msdk.video.module.a.a.f, com.mbridge.msdk.video.module.a.a
    public final void a(int i9, Object obj) {
        Integer num;
        int i10;
        int i11 = i9;
        if (this.f19019a) {
            String str = "";
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 5) {
                        int i12 = 6;
                        if (i11 != 6) {
                            if (i11 != 8) {
                                if (i11 != 20) {
                                    if (i11 != 114) {
                                        if (i11 != 116) {
                                            switch (i11) {
                                                case 10:
                                                    this.f19047q = true;
                                                    this.l.getJSNotifyProxy().a(0);
                                                    break;
                                                case 11:
                                                case 12:
                                                    this.l.getJSVideoModule().videoOperate(3);
                                                    if (this.b.getVideo_end_type() != 3) {
                                                        if (this.b.getAdSpaceT() != 2) {
                                                            this.l.getJSVideoModule().setVisible(8);
                                                        }
                                                    } else {
                                                        this.l.getJSVideoModule().setVisible(0);
                                                    }
                                                    if (i11 == 12) {
                                                        h();
                                                        i10 = 2;
                                                    } else {
                                                        i10 = 1;
                                                    }
                                                    this.l.getJSNotifyProxy().a(i10);
                                                    if (this.l.getJSCommon().g() == 2) {
                                                        this.l.getJSVideoModule().setVisible(0);
                                                        com.mbridge.msdk.video.signal.j jSVideoModule = this.l.getJSVideoModule();
                                                        this.l.getJSContainerModule().showMiniCard(jSVideoModule.getBorderViewTop(), jSVideoModule.getBorderViewLeft(), jSVideoModule.getBorderViewWidth(), jSVideoModule.getBorderViewHeight(), jSVideoModule.getBorderViewRadius());
                                                    } else if (i11 == 12) {
                                                        if (this.f19046p == 1) {
                                                            if (this.b.getAdSpaceT() != 2) {
                                                                this.l.getJSContainerModule().showEndcard(this.b.getVideo_end_type());
                                                            } else {
                                                                this.l.getJSContainerModule().showVideoEndCover();
                                                            }
                                                        }
                                                    } else if (this.b.getAdSpaceT() != 2) {
                                                        this.l.getJSContainerModule().showEndcard(this.b.getVideo_end_type());
                                                    } else {
                                                        this.l.getJSContainerModule().showVideoEndCover();
                                                    }
                                                    this.l.getJSVideoModule().dismissAllAlert();
                                                    if (i11 == 12 && !this.f19047q && this.f19046p == 1) {
                                                        h();
                                                        g();
                                                        f();
                                                        e();
                                                        if (af.a().a("i_l_s_t_r_i", false) && !this.f19045o) {
                                                            this.f19045o = true;
                                                            MBridgeVideoView.a aVar = this.f19048r;
                                                            if (aVar != null) {
                                                                aVar.a();
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    break;
                                                case 13:
                                                    if (!this.l.getJSVideoModule().isH5Canvas()) {
                                                        this.l.getJSVideoModule().closeVideoOperate(0, 2);
                                                    }
                                                    this.l.getJSNotifyProxy().a(-1);
                                                    break;
                                                case 14:
                                                    if (!this.f19044n) {
                                                        this.l.getJSVideoModule().closeVideoOperate(0, 1);
                                                        break;
                                                    }
                                                    break;
                                                case 15:
                                                    if (obj != null && (obj instanceof MBridgeVideoView.b)) {
                                                        this.f19044n = true;
                                                        this.l.getJSNotifyProxy().a((MBridgeVideoView.b) obj);
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    switch (i11) {
                                                        case 123:
                                                        case 124:
                                                            com.mbridge.msdk.video.signal.g jSNotifyProxy = this.l.getJSNotifyProxy();
                                                            if (i11 == 123) {
                                                                i12 = 7;
                                                            }
                                                            jSNotifyProxy.a(i12, "");
                                                            break;
                                                        case 125:
                                                            this.l.getJSContainerModule().hideAlertWebview();
                                                            break;
                                                    }
                                            }
                                        } else {
                                            com.mbridge.msdk.video.signal.j jSVideoModule2 = this.l.getJSVideoModule();
                                            this.l.getJSContainerModule().configurationChanged(jSVideoModule2.getBorderViewWidth(), jSVideoModule2.getBorderViewHeight(), jSVideoModule2.getBorderViewRadius());
                                        }
                                    } else if (this.l.getJSCommon().g() == 2) {
                                        com.mbridge.msdk.video.signal.j jSVideoModule3 = this.l.getJSVideoModule();
                                        this.l.getJSContainerModule().showMiniCard(jSVideoModule3.getBorderViewTop(), jSVideoModule3.getBorderViewLeft(), jSVideoModule3.getBorderViewWidth(), jSVideoModule3.getBorderViewHeight(), jSVideoModule3.getBorderViewRadius());
                                    }
                                } else if (af.a().a("i_l_s_t_r_i", false) && (obj instanceof MBridgeVideoView.a)) {
                                    this.f19048r = (MBridgeVideoView.a) obj;
                                }
                            } else if (!this.l.getJSContainerModule().showAlertWebView()) {
                                this.l.getJSVideoModule().showAlertView();
                            } else {
                                this.l.getJSVideoModule().alertWebViewShowed();
                            }
                        }
                    } else if (obj != null && (obj instanceof Integer)) {
                        if (((Integer) obj).intValue() == 1) {
                            num = 2;
                        } else {
                            num = 1;
                        }
                        this.l.getJSVideoModule().soundOperate(num.intValue(), -1);
                        this.l.getJSNotifyProxy().a(5, num + "");
                    }
                }
                this.l.getJSVideoModule().dismissAllAlert();
                if (i11 == 2) {
                    this.l.getJSNotifyProxy().a(2, "");
                }
                this.l.getJSVideoModule().videoOperate(3);
                int i13 = 16;
                if (this.l.getJSCommon().g() != 2) {
                    if (this.b.getVideo_end_type() != 3) {
                        this.l.getJSVideoModule().setVisible(8);
                    } else {
                        this.l.getJSVideoModule().setVisible(0);
                    }
                    if (this.m == 2 && !this.l.getJSContainerModule().endCardShowing() && this.b.getAdSpaceT() != 2) {
                        this.l.getJSContainerModule().showEndcard(this.b.getVideo_end_type());
                        i13 = i11;
                    }
                }
                this.l.getJSNotifyProxy().a(1);
                i11 = i13;
            } else if (!this.l.getJSContainerModule().endCardShowing()) {
                com.mbridge.msdk.video.signal.g jSNotifyProxy2 = this.l.getJSNotifyProxy();
                if (obj != null) {
                    str = obj.toString();
                }
                jSNotifyProxy2.a(1, str);
            }
        }
        super.a(i11, obj);
    }
}
