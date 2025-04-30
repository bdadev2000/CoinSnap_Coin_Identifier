package com.mbridge.msdk.out;

import android.app.Activity;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.mbridge.msdk.advanced.b.c;
import com.mbridge.msdk.foundation.tools.ai;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class MBNativeAdvancedHandler {
    private c nativeAdvancedProvider;

    /* renamed from: com.mbridge.msdk.out.MBNativeAdvancedHandler$1, reason: invalid class name */
    /* loaded from: classes3.dex */
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
        String e4 = ai.e(str2);
        if (!TextUtils.isEmpty(e4)) {
            ai.b(str2, e4);
        }
        this.nativeAdvancedProvider = new c(str, str2, activity);
    }

    public void autoLoopPlay(int i9) {
        c cVar = this.nativeAdvancedProvider;
        if (cVar != null) {
            cVar.c(i9);
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
        int i9 = AnonymousClass1.$SwitchMap$com$mbridge$msdk$out$MBMultiStateEnum[mBMultiStateEnum.ordinal()];
        int i10 = 1;
        if (i9 != 1) {
            if (i9 != 2) {
                i10 = -1;
            }
        } else {
            i10 = 0;
        }
        this.nativeAdvancedProvider.a(i10);
    }

    public void setNativeViewSize(int i9, int i10) {
        this.nativeAdvancedProvider.a(i10, i9);
    }

    public void setPlayMuteState(int i9) {
        c cVar = this.nativeAdvancedProvider;
        if (cVar != null) {
            cVar.b(i9);
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
