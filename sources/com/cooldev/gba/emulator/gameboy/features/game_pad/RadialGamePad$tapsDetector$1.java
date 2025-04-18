package com.cooldev.gba.emulator.gameboy.features.game_pad;

import android.graphics.PointF;
import com.cooldev.gba.emulator.gameboy.features.game_pad.dials.Dial;
import com.cooldev.gba.emulator.gameboy.features.game_pad.event.GestureType;
import com.cooldev.gba.emulator.gameboy.features.game_pad.touchbound.TouchBound;
import com.cooldev.gba.emulator.gameboy.features.game_pad.utils.TouchUtils;
import d0.b0;
import e0.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.r;
import p0.a;

/* loaded from: classes.dex */
public final class RadialGamePad$tapsDetector$1 extends r implements q0.r {
    final /* synthetic */ RadialGamePad this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RadialGamePad$tapsDetector$1(RadialGamePad radialGamePad) {
        super(4);
        this.this$0 = radialGamePad;
    }

    @Override // q0.r
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        invoke(((Number) obj).floatValue(), ((Number) obj2).floatValue(), ((Number) obj3).intValue(), ((Boolean) obj4).booleanValue());
        return b0.f30125a;
    }

    public final void invoke(float f2, float f3, int i2, boolean z2) {
        GestureType gestureType;
        List list;
        Map map;
        boolean z3;
        if (z2) {
            if (i2 == 0) {
                gestureType = GestureType.FIRST_TOUCH;
            } else if (i2 == 1) {
                gestureType = GestureType.SINGLE_TAP;
            } else if (i2 != 2) {
                gestureType = i2 != 3 ? null : GestureType.TRIPLE_TAP;
            } else {
                gestureType = GestureType.DOUBLE_TAP;
            }
            if (gestureType == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            list = this.this$0.allDials;
            if (list != null) {
                List<Dial> list2 = list;
                RadialGamePad radialGamePad = this.this$0;
                ArrayList arrayList2 = new ArrayList(q.M(list2, 10));
                for (Dial dial : list2) {
                    map = radialGamePad.touchBounds;
                    TouchBound touchBound = (TouchBound) map.get(dial);
                    if (touchBound == null || !touchBound.contains(f2, f3)) {
                        z3 = false;
                    } else {
                        PointF computeRelativePosition = TouchUtils.INSTANCE.computeRelativePosition(f2, f3, dial.drawingBox());
                        z3 = dial.gesture(computeRelativePosition.x, computeRelativePosition.y, gestureType, arrayList);
                    }
                    arrayList2.add(Boolean.valueOf(z3));
                }
                if (!arrayList2.isEmpty()) {
                    Iterator it = arrayList2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((Boolean) it.next()).booleanValue()) {
                                this.this$0.postInvalidate();
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                this.this$0.handleEvents(arrayList);
                return;
            }
            a.B0("allDials");
            throw null;
        }
    }
}
