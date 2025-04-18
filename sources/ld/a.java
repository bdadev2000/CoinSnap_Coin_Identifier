package ld;

import com.mbridge.msdk.foundation.entity.CampaignEx;

/* loaded from: classes4.dex */
public enum a {
    CLICK(CampaignEx.JSON_NATIVE_VIDEO_CLICK),
    /* JADX INFO: Fake field, exist only in values array */
    INVITATION_ACCEPTED("invitationAccept");


    /* renamed from: b, reason: collision with root package name */
    public final String f21351b;

    a(String str) {
        this.f21351b = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f21351b;
    }
}
