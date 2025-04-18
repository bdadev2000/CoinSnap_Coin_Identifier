package com.mbridge.msdk.video.module.a.a;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.af;
import com.mbridge.msdk.video.module.MBridgeVideoView;
import com.mbridge.msdk.video.signal.factory.IJSFactory;

/* loaded from: classes4.dex */
public final class n extends o {

    /* renamed from: l, reason: collision with root package name */
    private IJSFactory f16056l;

    /* renamed from: m, reason: collision with root package name */
    private int f16057m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f16058n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f16059o;

    /* renamed from: p, reason: collision with root package name */
    private int f16060p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f16061q;

    /* renamed from: r, reason: collision with root package name */
    private MBridgeVideoView.a f16062r;

    public n(IJSFactory iJSFactory, CampaignEx campaignEx, com.mbridge.msdk.videocommon.b.c cVar, com.mbridge.msdk.videocommon.download.a aVar, String str, String str2, int i10, int i11, com.mbridge.msdk.video.module.a.a aVar2, int i12, boolean z10, int i13) {
        super(campaignEx, cVar, aVar, str, str2, aVar2, i12, z10);
        boolean z11;
        this.f16058n = false;
        this.f16059o = false;
        this.f16061q = false;
        this.f16056l = iJSFactory;
        this.f16057m = i10;
        if (i11 == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f16058n = z11;
        this.f16060p = i13;
        if (iJSFactory == null) {
            this.a = false;
        }
    }

    @Override // com.mbridge.msdk.video.module.a.a.o, com.mbridge.msdk.video.module.a.a.k, com.mbridge.msdk.video.module.a.a.f, com.mbridge.msdk.video.module.a.a
    public final void a(int i10, Object obj) {
        Integer num;
        int i11;
        int i12 = i10;
        if (this.a) {
            String str = "";
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 5) {
                        int i13 = 6;
                        if (i12 != 6) {
                            if (i12 != 8) {
                                if (i12 != 20) {
                                    if (i12 != 114) {
                                        if (i12 != 116) {
                                            switch (i12) {
                                                case 10:
                                                    this.f16061q = true;
                                                    this.f16056l.getJSNotifyProxy().a(0);
                                                    break;
                                                case 11:
                                                case 12:
                                                    this.f16056l.getJSVideoModule().videoOperate(3);
                                                    if (this.f16034b.getVideo_end_type() != 3) {
                                                        if (this.f16034b.getAdSpaceT() != 2) {
                                                            this.f16056l.getJSVideoModule().setVisible(8);
                                                        }
                                                    } else {
                                                        this.f16056l.getJSVideoModule().setVisible(0);
                                                    }
                                                    if (i12 == 12) {
                                                        h();
                                                        i11 = 2;
                                                    } else {
                                                        i11 = 1;
                                                    }
                                                    this.f16056l.getJSNotifyProxy().a(i11);
                                                    if (this.f16056l.getJSCommon().g() == 2) {
                                                        this.f16056l.getJSVideoModule().setVisible(0);
                                                        com.mbridge.msdk.video.signal.j jSVideoModule = this.f16056l.getJSVideoModule();
                                                        this.f16056l.getJSContainerModule().showMiniCard(jSVideoModule.getBorderViewTop(), jSVideoModule.getBorderViewLeft(), jSVideoModule.getBorderViewWidth(), jSVideoModule.getBorderViewHeight(), jSVideoModule.getBorderViewRadius());
                                                    } else if (i12 == 12) {
                                                        if (this.f16060p == 1) {
                                                            if (this.f16034b.getAdSpaceT() != 2) {
                                                                this.f16056l.getJSContainerModule().showEndcard(this.f16034b.getVideo_end_type());
                                                            } else {
                                                                this.f16056l.getJSContainerModule().showVideoEndCover();
                                                            }
                                                        }
                                                    } else if (this.f16034b.getAdSpaceT() != 2) {
                                                        this.f16056l.getJSContainerModule().showEndcard(this.f16034b.getVideo_end_type());
                                                    } else {
                                                        this.f16056l.getJSContainerModule().showVideoEndCover();
                                                    }
                                                    this.f16056l.getJSVideoModule().dismissAllAlert();
                                                    if (i12 == 12 && !this.f16061q && this.f16060p == 1) {
                                                        h();
                                                        g();
                                                        f();
                                                        e();
                                                        if (af.a().a("i_l_s_t_r_i", false) && !this.f16059o) {
                                                            this.f16059o = true;
                                                            MBridgeVideoView.a aVar = this.f16062r;
                                                            if (aVar != null) {
                                                                aVar.a();
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    break;
                                                case 13:
                                                    if (!this.f16056l.getJSVideoModule().isH5Canvas()) {
                                                        this.f16056l.getJSVideoModule().closeVideoOperate(0, 2);
                                                    }
                                                    this.f16056l.getJSNotifyProxy().a(-1);
                                                    break;
                                                case 14:
                                                    if (!this.f16058n) {
                                                        this.f16056l.getJSVideoModule().closeVideoOperate(0, 1);
                                                        break;
                                                    }
                                                    break;
                                                case 15:
                                                    if (obj != null && (obj instanceof MBridgeVideoView.b)) {
                                                        this.f16058n = true;
                                                        this.f16056l.getJSNotifyProxy().a((MBridgeVideoView.b) obj);
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    switch (i12) {
                                                        case 123:
                                                        case 124:
                                                            com.mbridge.msdk.video.signal.g jSNotifyProxy = this.f16056l.getJSNotifyProxy();
                                                            if (i12 == 123) {
                                                                i13 = 7;
                                                            }
                                                            jSNotifyProxy.a(i13, "");
                                                            break;
                                                        case 125:
                                                            this.f16056l.getJSContainerModule().hideAlertWebview();
                                                            break;
                                                    }
                                            }
                                        } else {
                                            com.mbridge.msdk.video.signal.j jSVideoModule2 = this.f16056l.getJSVideoModule();
                                            this.f16056l.getJSContainerModule().configurationChanged(jSVideoModule2.getBorderViewWidth(), jSVideoModule2.getBorderViewHeight(), jSVideoModule2.getBorderViewRadius());
                                        }
                                    } else if (this.f16056l.getJSCommon().g() == 2) {
                                        com.mbridge.msdk.video.signal.j jSVideoModule3 = this.f16056l.getJSVideoModule();
                                        this.f16056l.getJSContainerModule().showMiniCard(jSVideoModule3.getBorderViewTop(), jSVideoModule3.getBorderViewLeft(), jSVideoModule3.getBorderViewWidth(), jSVideoModule3.getBorderViewHeight(), jSVideoModule3.getBorderViewRadius());
                                    }
                                } else if (af.a().a("i_l_s_t_r_i", false) && (obj instanceof MBridgeVideoView.a)) {
                                    this.f16062r = (MBridgeVideoView.a) obj;
                                }
                            } else if (!this.f16056l.getJSContainerModule().showAlertWebView()) {
                                this.f16056l.getJSVideoModule().showAlertView();
                            } else {
                                this.f16056l.getJSVideoModule().alertWebViewShowed();
                            }
                        }
                    } else if (obj != null && (obj instanceof Integer)) {
                        if (((Integer) obj).intValue() == 1) {
                            num = 2;
                        } else {
                            num = 1;
                        }
                        this.f16056l.getJSVideoModule().soundOperate(num.intValue(), -1);
                        this.f16056l.getJSNotifyProxy().a(5, num + "");
                    }
                }
                this.f16056l.getJSVideoModule().dismissAllAlert();
                if (i12 == 2) {
                    this.f16056l.getJSNotifyProxy().a(2, "");
                }
                this.f16056l.getJSVideoModule().videoOperate(3);
                int i14 = 16;
                if (this.f16056l.getJSCommon().g() != 2) {
                    if (this.f16034b.getVideo_end_type() != 3) {
                        this.f16056l.getJSVideoModule().setVisible(8);
                    } else {
                        this.f16056l.getJSVideoModule().setVisible(0);
                    }
                    if (this.f16057m == 2 && !this.f16056l.getJSContainerModule().endCardShowing() && this.f16034b.getAdSpaceT() != 2) {
                        this.f16056l.getJSContainerModule().showEndcard(this.f16034b.getVideo_end_type());
                        i14 = i12;
                    }
                }
                this.f16056l.getJSNotifyProxy().a(1);
                i12 = i14;
            } else if (!this.f16056l.getJSContainerModule().endCardShowing()) {
                com.mbridge.msdk.video.signal.g jSNotifyProxy2 = this.f16056l.getJSNotifyProxy();
                if (obj != null) {
                    str = obj.toString();
                }
                jSNotifyProxy2.a(1, str);
            }
        }
        super.a(i12, obj);
    }
}
