package com.mbridge.msdk.dycreator.baseview;

import android.content.Context;
import android.util.AttributeSet;
import com.mbridge.msdk.dycreator.binding.response.SplashResData;
import com.mbridge.msdk.dycreator.bus.EventBus;
import com.mbridge.msdk.dycreator.listener.action.EAction;
import com.mbridge.msdk.e.a.a;
import com.mbridge.msdk.e.a.b;

/* loaded from: classes4.dex */
public class MBCountDownView extends MBTextView {
    private b a;

    /* renamed from: b, reason: collision with root package name */
    private MBCountDownView f12671b;

    public MBCountDownView(Context context) {
        super(context);
        this.f12671b = this;
    }

    public void initView(final String str, final String str2, int i10) {
        this.a = new b().b(i10 * 1000).a(1000L).a(new a() { // from class: com.mbridge.msdk.dycreator.baseview.MBCountDownView.1
            @Override // com.mbridge.msdk.e.a.a
            public void onFinish() {
                MBCountDownView.this.a.a();
                SplashResData splashResData = new SplashResData();
                splashResData.seteAction(EAction.CLOSE);
                EventBus.getDefault().post(splashResData);
            }

            @Override // com.mbridge.msdk.e.a.a
            public void onTick(long j3) {
                if (str2.startsWith("zh")) {
                    MBCountDownView.this.f12671b.setText((j3 / 1000) + "s" + str);
                    return;
                }
                MBCountDownView.this.f12671b.setText(MBCountDownView.this.f12671b + " " + (j3 / 1000) + "s");
            }
        });
    }

    @Override // com.mbridge.msdk.dycreator.baseview.MBTextView, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        b bVar = this.a;
        if (bVar != null) {
            bVar.b();
        }
    }

    @Override // com.mbridge.msdk.dycreator.baseview.MBTextView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b bVar = this.a;
        if (bVar != null) {
            bVar.a();
        }
    }

    public MBCountDownView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12671b = this;
    }

    public MBCountDownView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f12671b = this;
    }
}
