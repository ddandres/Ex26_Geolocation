/*
 * Copyright (c) 2022-2024 Universitat Politècnica de València
 * Authors: David de Andrés and Juan Carlos Ruiz
 *          Fault-Tolerant Systems
 *          Instituto ITACA
 *          Universitat Politècnica de València
 *
 * Distributed under MIT license
 * (See accompanying file LICENSE.txt)
 */

package upv.dadm.ex26_geolocation.ui.location

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.activityViewModels
import upv.dadm.ex26_geolocation.R

/**
 * Displays the user a dialog with a description of why permissions must be granted
 * for a given for the desired functionality.
 */
class BackgroundLocationRationaleDialogFragment : DialogFragment() {

    // Reference to the ViewModel shared between Fragments
    private val viewModel: LocationViewModel by activityViewModels()

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog =
        // Create the dialog with a single Button to dismiss it
        AlertDialog.Builder(requireContext())
            .setTitle(R.string.rationale_title_background)
            .setMessage(R.string.rationale_message_background)
            .setPositiveButton(R.string.understood) { _, _ ->
                viewModel.setBackgroundLocationRationaleUnderstood(true)
                dismiss()
            }
            .create()
}