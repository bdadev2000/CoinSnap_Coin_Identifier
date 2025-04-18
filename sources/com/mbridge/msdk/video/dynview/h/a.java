package com.mbridge.msdk.video.dynview.h;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.mbridge.msdk.dycreator.wrapper.DyAdType;
import com.mbridge.msdk.dycreator.wrapper.DyOption;
import com.mbridge.msdk.dycreator.wrapper.DynamicViewCreator;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.v;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.video.dynview.e.e;
import com.mbridge.msdk.video.dynview.e.h;
import com.mbridge.msdk.video.dynview.j.c;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class a {
    private static boolean a = false;

    public a() {
    }

    public a(Context context, List<CampaignEx> list, h hVar, Map<String, Object> map) {
        a(new c().a(context, list), hVar, map);
    }

    private void a(com.mbridge.msdk.video.dynview.c cVar, final h hVar, Map<String, Object> map) {
        View inflate;
        if (hVar == null) {
            return;
        }
        if (cVar == null) {
            hVar.a(com.mbridge.msdk.video.dynview.c.a.NOT_FOUND_VIEWOPTION);
            return;
        }
        if (cVar.a() == null) {
            hVar.a(com.mbridge.msdk.video.dynview.c.a.NOT_FOUND_CONTEXT);
            return;
        }
        if (TextUtils.isEmpty(cVar.b())) {
            hVar.a(com.mbridge.msdk.video.dynview.c.a.NOT_FOUND_LAYOUTNAME);
            return;
        }
        try {
            if (cVar.l() != null) {
                inflate = DynamicViewCreator.getInstance().createDynamicView(new DyOption.Builder().campaignEx((cVar.g() == null || cVar.g().size() <= 0) ? null : cVar.g().get(0)).fileDirs(cVar.l()).dyAdType(DyAdType.REWARD).orientation(cVar.e()).templateType(cVar.h()).build());
                if (inflate != null) {
                    a = true;
                } else {
                    a = false;
                    inflate = LayoutInflater.from(cVar.a()).inflate(v.a(cVar.a(), cVar.b(), TtmlNode.TAG_LAYOUT), (ViewGroup) null);
                }
            } else {
                a = false;
                inflate = LayoutInflater.from(cVar.a()).inflate(v.a(cVar.a(), cVar.b(), TtmlNode.TAG_LAYOUT), (ViewGroup) null);
            }
            if (map == null) {
                map = new HashMap<>();
            }
            map.put("is_dy_success", Boolean.valueOf(a));
            com.mbridge.msdk.video.dynview.b.b.a().a(inflate, cVar, map);
            com.mbridge.msdk.video.dynview.b.a.a().a(inflate, cVar, map, new e() { // from class: com.mbridge.msdk.video.dynview.h.a.1
                @Override // com.mbridge.msdk.video.dynview.e.e
                public final void a(View view, List<View> list) {
                    com.mbridge.msdk.video.dynview.a aVar = new com.mbridge.msdk.video.dynview.a();
                    aVar.a(view);
                    aVar.a(list);
                    aVar.a(a.a);
                    hVar.a(aVar);
                }

                @Override // com.mbridge.msdk.video.dynview.e.e
                public final void a(com.mbridge.msdk.video.dynview.c.a aVar) {
                    hVar.a(aVar);
                }
            });
        } catch (Exception e2) {
            ad.b("MBridgeUI", e2.getMessage());
            hVar.a(com.mbridge.msdk.video.dynview.c.a.VIEW_CREATE_ERROR);
        }
    }

    public a(com.mbridge.msdk.video.dynview.c cVar, h hVar, Map<String, Object> map) {
        a(cVar, hVar, map);
    }
}
