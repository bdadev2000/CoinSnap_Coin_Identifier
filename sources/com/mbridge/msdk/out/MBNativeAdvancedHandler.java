package com.mbridge.msdk.out;

import android.app.Activity;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.mbridge.msdk.advanced.b.c;
import com.mbridge.msdk.foundation.tools.ai;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class MBNativeAdvancedHandler {
    private c nativeAdvancedProvider;

    /* renamed from: com.mbridge.msdk.out.MBNativeAdvancedHandler$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$mbridge$msdk$out$MBMultiStateEnum;

        static {
            int[] iArr = new int[MBMultiStateEnum.values().length];
            $SwitchMap$com$mbridge$msdk$out$MBMultiStateEnum = iArr;
            try {
                iArr[MBMultiStateEnum.negative.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$mbridge$msdk$out$MBMultiStateEnum[MBMultiStateEnum.positive.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$mbridge$msdk$out$MBMultiStateEnum[MBMultiStateEnum.undefined.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public MBNativeAdvancedHandler(Activity activity, String str, String str2) {
        String e2 = ai.e(str2);
        if (!TextUtils.isEmpty(e2)) {
            ai.b(str2, e2);
        }
        this.nativeAdvancedProvider = new c(str, str2, activity);
    }

    public void autoLoopPlay(int i10) {
        c cVar = this.nativeAdvancedProvider;
        if (cVar != null) {
            cVar.c(i10);
        }
    }

    public ViewGroup getAdViewGroup() {
        c cVar = this.nativeAdvancedProvider;
        if (cVar != null) {
            return cVar.b();
        }
        return null;
    }

    public String getCreativeIdWithUnitId() {
        c cVar = this.nativeAdvancedProvider;
        if (cVar != null) {
            return cVar.e();
        }
        return "";
    }

    public String getRequestId() {
        c cVar = this.nativeAdvancedProvider;
        if (cVar != null) {
            return cVar.d();
        }
        return "";
    }

    public boolean isReady() {
        return isReady("");
    }

    public void load() {
        c cVar = this.nativeAdvancedProvider;
        if (cVar != null) {
            cVar.b("");
        }
    }

    public void loadByToken(String str) {
        c cVar = this.nativeAdvancedProvider;
        if (cVar != null) {
            cVar.a(str);
        }
    }

    public void onPause() {
        c cVar = this.nativeAdvancedProvider;
        if (cVar != null) {
            cVar.e(3);
        }
    }

    public void onResume() {
        c cVar = this.nativeAdvancedProvider;
        if (cVar != null) {
            cVar.d(3);
        }
    }

    public void release() {
        c cVar = this.nativeAdvancedProvider;
        if (cVar != null) {
            cVar.f();
        }
    }

    public void setAdListener(NativeAdvancedAdListener nativeAdvancedAdListener) {
        c cVar = this.nativeAdvancedProvider;
        if (cVar != null) {
            cVar.a(nativeAdvancedAdListener);
        }
    }

    public void setCloseButtonState(MBMultiStateEnum mBMultiStateEnum) {
        int i10 = AnonymousClass1.$SwitchMap$com$mbridge$msdk$out$MBMultiStateEnum[mBMultiStateEnum.ordinal()];
        int i11 = 1;
        if (i10 != 1) {
            if (i10 != 2) {
                i11 = -1;
            }
        } else {
            i11 = 0;
        }
        this.nativeAdvancedProvider.a(i11);
    }

    public void setNativeViewSize(int i10, int i11) {
        this.nativeAdvancedProvider.a(i11, i10);
    }

    public void setPlayMuteState(int i10) {
        c cVar = this.nativeAdvancedProvider;
        if (cVar != null) {
            cVar.b(i10);
        }
    }

    public void setViewElementStyle(JSONObject jSONObject) {
        c cVar = this.nativeAdvancedProvider;
        if (cVar != null) {
            cVar.a(jSONObject);
        }
    }

    public boolean isReady(String str) {
        c cVar = this.nativeAdvancedProvider;
        if (cVar != null) {
            return cVar.c(str);
        }
        return false;
    }
}
