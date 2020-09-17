/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package app.tivi.episodedetails

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewGroup.LayoutParams.MATCH_PARENT
import androidx.compose.navigation.NavHost
import androidx.compose.navigation.composable
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Providers
import androidx.compose.ui.platform.ComposeView
import androidx.fragment.app.Fragment
import app.tivi.common.compose.ProvideDisplayInsets
import app.tivi.common.compose.TiviDateFormatterAmbient
import app.tivi.navigation.Screen
import app.tivi.showdetails.details.ShowDetailsFragmentViewModel
import app.tivi.util.TiviDateFormatter
import com.google.android.material.composethemeadapter.MdcTheme
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class ComposeNavigationFragment : Fragment() {
    @Inject internal lateinit var showDetailsViewModelFactory: ShowDetailsFragmentViewModel.Factory
    @Inject internal lateinit var episodeDetailsViewModelFactory: EpisodeDetailsViewModel.Factory

    @Inject internal lateinit var tiviDateFormatter: TiviDateFormatter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = ComposeView(requireContext()).apply {
        layoutParams = ViewGroup.LayoutParams(MATCH_PARENT, MATCH_PARENT)
        setContent {
            MdcTheme {
                Providers(TiviDateFormatterAmbient provides tiviDateFormatter) {
                    ProvideDisplayInsets {
                        // TODO
                    }
                }
            }
        }
    }

    @Composable
    internal fun Navigator() {
        NavHost(startDestination = Unit) {
            composable(Screen.Discover.KEY) {
                // TODO
            }

            composable(Screen.EpisodeDetails.KEY) {
                // TODO
            }

            composable(Screen.ShowDetails.KEY) {
                // TODO
            }
        }
    }
}
