package chat.rocket.android.fragment.server_config;

import android.view.View;
import android.widget.TextView;
import chat.rocket.android.R;

/**
 * Just showing "connecting..." screen.
 */
public class ConnectingToHostFragment extends AbstractServerConfigFragment {
  @Override protected int getLayout() {
    return R.layout.fragment_wait_for_connection;
  }

  @Override protected void onSetupView() {
    TextView caption = (TextView) rootView.findViewById(R.id.txt_caption);
    caption.setVisibility(View.GONE);
  }
}